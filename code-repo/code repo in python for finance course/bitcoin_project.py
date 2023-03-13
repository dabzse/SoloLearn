import numpy as np
import numpy_financial as npf
import matplotlib.pyplot as plt
import yfinance as yf


# price for 2018-2021
bitcoin = [3869.47, 7188.46, 22203.31, 29391.78]
cashflow = [-7000, 38694.7, 71884.6, 222033.1, 293917.8]

print(np.std(np.array(bitcoin)))
print(npf.irr(cashflow))

data = yf.Ticker('BTC-USD')
x = data.history('1y')  # ['Close']
# x.plot()

# plt.plot(bitcoin)
# plt.savefig('bitcoin.png')


risk = np.std(x) * np.sqrt(252)
sharpe = (np.mean(x)/np.std(x))*np.sqrt(252)

print("Risk", risk)
print("Sharpe", sharpe)
plt.plot(x)
plt.savefig("x.png")

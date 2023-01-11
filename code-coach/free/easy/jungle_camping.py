sound = input().split(" ")
out = []

for noise in sound:
    if noise == "Rawr":
        out.append("Tiger")
    if noise == "Grr":
        out.append("Lion")
    if noise == "Ssss":
        out.append("Snake")
    if noise == "Chirp":
        out.append("Bird")
print(" ".join(out))

# pro

class Player:
    def __init__(self, name, lives):
        self.name = name
        self._lives = lives

    def hit(self):
        # your code goes here

        self._lives -= 1
        if self._lives == 0:
            print("Game Over")

p = Player("Cyberpunk77", 3)
p.hit()
p.hit()
p.hit()

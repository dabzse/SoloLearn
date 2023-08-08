class Player:
    def __init__(self, name, level):
        self.name = name
        self.level = level

    def intro(self):
        print(self.name + " (Level " + self.level + ")")

# your code goes here
player_name = input()
player_level = input()
player = Player(player_name, player_level)
player.intro()

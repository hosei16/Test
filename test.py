nba_player = {"Harden" : 33, "James": 25, "Westbrook": 22, "Davis": 27}

def player_scores(item1,item2):

    difference = nba_player[item1] % nba_player[item2]
    return difference

print(player_scores("Harden","James"))

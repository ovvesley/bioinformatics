from collections import defaultdict

def find_clumps(genome, k, L, t):
        length = len(genome) - k + 1
        indexes = defaultdict(list)
        result = set()

        for i in range(length):
            
            kterm = genome[i:i + k]

            # remove positions with distance > L
            while indexes[kterm] and i + k - indexes[kterm][0] > L:
                indexes[kterm].pop(0)

            # add current kterm position
            indexes[kterm].append(i)

            if len(indexes[kterm]) == t:
                result.add(kterm)
        print(defaultdict)
        return result

with open('../genomes/E_coli.txt', 'r') as f:
    k = 9
    L = 500
    t = 3
    
    genome = f.read()
    print(find_clumps(genome, k, L, t))
    
    




    
    




genome_1 = "AA"
genome_2 = "AA"

if len(genome_1) == len(genome_2):
    divergent = 0
    for (base_1, base_2) in zip(genome_1, genome_2):
        print(base_1, base_2)

        if base_1 != base_2:
            divergent = divergent + 1
    print(divergent)
else:
    print("error!")

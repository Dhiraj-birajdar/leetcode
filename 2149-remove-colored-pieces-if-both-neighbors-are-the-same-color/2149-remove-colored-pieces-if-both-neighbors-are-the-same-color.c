bool winnerOfGame(char *colors) {
    int len = strlen(colors);
    int countA = 0, countB = 0;

    for (int i = 0; i < len; i++) {
        char x = colors[i];
        int count = 0;

        while (i < len && colors[i] == x) {
            i++;
            count++;
        }

        if (x == 'A') {
            countA += (count - 2 > 0) ? count - 2 : 0;
        } else if (x == 'B') {
            countB += (count - 2 > 0) ? count - 2 : 0;
        }

        i--;  
    }

    return countA > countB;
}
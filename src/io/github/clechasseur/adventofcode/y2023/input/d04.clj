(ns io.github.clechasseur.adventofcode.y2023.input.d04)

(def input
  [{:card 1 :winning-numbers #{4 33 89 61 95 36 5 30 26 55} :numbers #{15 33 28 36 93 57 26 13 95 4 18 79 6 87 60 66 69 67 19 42 22 61 78 5 58}}
   {:card 2 :winning-numbers #{9 16 48 75 82 61 56 91 3 27} :numbers #{4 12 96 20 22 13 6 86 61 94 95 30 9 75 56 38 26 28 7 16 42 55 2 34 8}}
   {:card 3 :winning-numbers #{91 74 25 36 96 64 70 48 93 89} :numbers #{67 86 52 89 19 91 48 64 23 72 6 80 58 96 74 15 35 10 70 63 25 14 87 93 36}}
   {:card 4 :winning-numbers #{51 1 79 93 89 84 16 70 98 22} :numbers #{89 93 15 82 99 32 49 22 16 1 76 13 18 21 98 79 77 84 70 55 24 51 66 26 68}}
   {:card 5 :winning-numbers #{55 45 89 38 19 12 80 68 42 18} :numbers #{55 41 35 29 67 89 50 98 86 80 91 19 90 25 43 37 83 46 42 38 76 95 93 68 45}}
   {:card 6 :winning-numbers #{67 71 31 80 6 4 37 44 48 51} :numbers #{46 52 88 65 31 87 69 34 30 15 37 47 20 16 13 42 18 56 73 53 27 89 95 14 77}}
   {:card 7 :winning-numbers #{19 71 16 57 88 79 18 58 73 83} :numbers #{84 61 99 94 17 96 39 90 63 69 66 80 55 60 41 74 95 13 28 32 4 59 5 3 6}}
   {:card 8 :winning-numbers #{92 62 75 14 19 12 64 23 70 93} :numbers #{81 33 16 23 68 96 79 57 59 78 38 56 93 70 35 63 51 71 90 86 91 64 54 34 1}}
   {:card 9 :winning-numbers #{55 28 87 48 85 56 31 32 25 52} :numbers #{43 19 52 96 56 85 26 38 28 60 95 1 15 3 13 71 93 76 4 83 48 9 37 88 80}}
   {:card 10 :winning-numbers #{70 13 57 30 27 31 12 29 82 38} :numbers #{28 44 43 82 71 15 14 74 38 72 26 83 29 96 30 77 66 27 51 9 84 68 57 64 32}}
   {:card 11 :winning-numbers #{15 86 34 17 26 87 64 20 38 67} :numbers #{64 97 20 56 72 87 80 90 95 58 25 89 30 82 59 27 62 29 1 76 94 74 52 67 92}}
   {:card 12 :winning-numbers #{55 49 59 54 51 15 36 45 74 82} :numbers #{63 74 76 3 51 75 87 31 27 64 79 58 59 80 62 85 56 4 66 91 96 82 22 81 46}}
   {:card 13 :winning-numbers #{96 79 26 30 28 58 85 44 71 11} :numbers #{79 81 5 42 53 36 29 82 34 32 73 26 72 24 78 85 2 93 28 12 45 35 68 37 43}}
   {:card 14 :winning-numbers #{50 6 10 49 99 14 95 32 56 66} :numbers #{93 7 13 77 52 78 73 36 33 56 66 95 11 98 34 25 32 48 44 65 49 71 6 35 31}}
   {:card 15 :winning-numbers #{44 56 18 91 8 7 98 79 96 76} :numbers #{74 83 81 46 96 38 9 51 77 72 82 68 76 57 48 90 3 62 56 91 21 28 22 10 37}}
   {:card 16 :winning-numbers #{32 87 62 33 15 31 40 3 9 85} :numbers #{88 48 42 47 84 94 37 70 90 56 19 24 8 7 25 45 27 71 81 57 65 52 36 66 58}}
   {:card 17 :winning-numbers #{44 35 75 95 87 64 15 21 54 82} :numbers #{18 56 25 5 15 51 47 39 8 1 30 98 58 96 32 87 12 55 63 86 89 84 69 7 95}}
   {:card 18 :winning-numbers #{21 79 12 27 69 88 75 34 66 2} :numbers #{48 26 57 60 20 29 96 22 64 73 30 38 44 94 46 55 9 91 78 84 89 10 93 53 6}}
   {:card 19 :winning-numbers #{17 81 36 92 90 86 59 41 40 34} :numbers #{48 71 3 99 87 39 10 35 37 57 46 20 49 90 50 70 55 2 23 5 25 16 77 24 94}}
   {:card 20 :winning-numbers #{75 95 91 52 32 47 39 20 35 44} :numbers #{30 87 76 13 49 83 82 51 1 22 17 29 68 66 80 33 10 84 46 31 16 40 97 24 78}}
   {:card 21 :winning-numbers #{98 63 87 15 81 61 92 77 97 25} :numbers #{8 35 81 12 21 16 77 83 52 6 24 91 92 31 97 61 11 49 66 17 45 63 4 80 99}}
   {:card 22 :winning-numbers #{20 91 49 50 9 71 92 25 14 94} :numbers #{40 94 13 85 25 28 4 84 50 71 92 35 20 9 88 60 49 18 70 91 14 19 98 51 41}}
   {:card 23 :winning-numbers #{9 21 89 17 42 13 80 27 81 10} :numbers #{89 20 24 93 4 48 29 9 39 42 37 6 91 83 14 41 2 72 30 81 57 69 94 49 76}}
   {:card 24 :winning-numbers #{63 1 62 2 93 18 11 83 70 25} :numbers #{38 53 12 83 11 62 13 70 2 18 63 28 25 50 23 44 1 69 16 7 31 99 98 90 27}}
   {:card 25 :winning-numbers #{19 9 73 32 24 6 10 62 47 98} :numbers #{28 95 81 49 32 98 19 10 21 42 48 63 2 69 84 92 47 99 20 25 5 39 7 65 91}}
   {:card 26 :winning-numbers #{12 22 47 17 35 27 4 18 89 97} :numbers #{57 95 42 67 93 19 61 27 60 49 31 15 35 68 81 18 40 16 72 83 80 17 48 6 7}}
   {:card 27 :winning-numbers #{50 11 3 16 86 51 57 98 1 82} :numbers #{9 28 98 6 78 21 51 17 44 91 50 37 79 68 4 12 47 63 76 85 16 60 7 53 1}}
   {:card 28 :winning-numbers #{14 18 82 45 77 81 68 6 87 67} :numbers #{58 53 87 18 65 23 32 13 81 26 61 11 34 97 28 51 72 20 85 89 8 57 95 21 45}}
   {:card 29 :winning-numbers #{52 61 26 15 20 37 34 90 93 74} :numbers #{99 60 61 26 24 83 1 16 33 55 52 46 23 90 37 21 93 20 44 18 15 62 72 45 34}}
   {:card 30 :winning-numbers #{54 78 45 53 10 86 3 58 47 23} :numbers #{95 18 28 34 63 3 90 19 31 10 79 87 23 13 8 37 73 58 4 85 78 62 84 41 64}}
   {:card 31 :winning-numbers #{32 9 36 62 37 60 51 61 50 19} :numbers #{60 27 26 63 78 19 90 47 79 21 51 62 13 56 8 9 39 74 33 91 98 65 58 37 7}}
   {:card 32 :winning-numbers #{58 97 39 63 5 10 59 16 20 32} :numbers #{67 98 78 97 50 72 87 46 21 79 91 20 51 84 10 96 11 43 32 75 39 83 47 58 5}}
   {:card 33 :winning-numbers #{94 13 40 18 29 6 56 53 67 64} :numbers #{20 41 90 14 29 85 58 13 53 16 10 76 27 44 1 69 49 70 36 73 66 54 23 48 72}}
   {:card 34 :winning-numbers #{95 81 26 82 32 65 11 33 90 75} :numbers #{61 26 95 83 18 58 63 98 14 77 97 94 49 45 15 59 73 88 62 48 8 32 11 71 70}}
   {:card 35 :winning-numbers #{75 97 71 16 32 72 99 4 47 86} :numbers #{61 47 75 49 96 6 22 48 98 4 70 73 87 63 9 94 76 13 7 52 21 99 28 39 29}}
   {:card 36 :winning-numbers #{8 16 18 96 52 67 51 20 48 9} :numbers #{60 79 66 32 76 14 88 47 2 5 15 28 74 72 83 24 58 17 63 21 81 55 38 90 11}}
   {:card 37 :winning-numbers #{57 52 94 36 9 98 32 15 68 84} :numbers #{11 66 29 71 93 56 59 7 4 57 85 48 30 63 60 33 54 28 68 10 95 76 49 80 27}}
   {:card 38 :winning-numbers #{32 7 92 77 29 70 46 80 34 73} :numbers #{2 88 28 56 74 67 52 91 30 33 8 51 44 47 38 18 69 19 26 98 61 5 96 99 21}}
   {:card 39 :winning-numbers #{35 59 49 80 72 70 46 53 6 28} :numbers #{62 52 30 81 36 55 65 29 85 83 66 89 27 7 93 12 78 90 25 82 23 91 54 50 56}}
   {:card 40 :winning-numbers #{4 14 51 70 93 54 75 95 39 74} :numbers #{55 24 64 95 14 36 74 70 54 44 4 75 91 41 33 85 73 6 93 30 39 16 57 51 42}}
   {:card 41 :winning-numbers #{90 85 22 27 35 18 41 93 54 75} :numbers #{21 16 14 31 17 39 96 8 57 18 82 46 90 35 85 44 88 75 93 29 22 54 41 59 27}}
   {:card 42 :winning-numbers #{11 16 63 67 80 39 54 73 85 21} :numbers #{6 25 39 41 56 14 21 42 7 75 36 1 46 29 38 27 93 97 57 79 33 91 16 13 67}}
   {:card 43 :winning-numbers #{58 28 65 7 45 46 52 50 59 67} :numbers #{8 62 54 70 28 92 74 13 97 66 40 78 22 27 49 69 63 50 65 15 30 68 14 48 53}}
   {:card 44 :winning-numbers #{27 65 61 52 1 45 46 94 98 33} :numbers #{68 52 99 33 45 1 30 79 98 38 28 34 46 6 94 27 65 15 24 61 81 40 62 16 83}}
   {:card 45 :winning-numbers #{5 24 1 26 19 76 72 46 32 57} :numbers #{39 60 20 32 83 54 57 7 95 64 14 99 73 94 76 53 19 40 1 49 78 37 29 58 63}}
   {:card 46 :winning-numbers #{95 80 51 45 69 28 3 99 96 73} :numbers #{55 37 80 68 51 45 96 99 60 56 59 58 35 28 44 3 73 92 63 5 31 13 69 38 95}}
   {:card 47 :winning-numbers #{11 40 88 85 44 76 13 24 63 73} :numbers #{40 73 49 14 22 50 83 88 66 24 6 44 4 78 63 76 85 9 53 21 69 11 16 43 13}}
   {:card 48 :winning-numbers #{60 13 61 28 4 24 3 33 94 53} :numbers #{71 95 91 7 39 53 28 4 43 24 88 25 87 79 33 38 37 67 94 61 73 13 89 60 32}}
   {:card 49 :winning-numbers #{50 46 22 6 45 17 78 70 27 83} :numbers #{6 31 9 51 96 22 83 75 45 94 24 65 78 27 50 39 70 91 43 46 76 29 17 2 8}}
   {:card 50 :winning-numbers #{39 22 37 63 23 72 58 12 50 53} :numbers #{22 12 35 76 48 8 53 79 37 67 30 72 39 75 5 63 80 23 28 87 34 33 44 58 50}}
   {:card 51 :winning-numbers #{8 53 76 39 35 84 78 60 85 26} :numbers #{63 82 79 53 85 84 14 88 50 67 93 60 24 39 55 68 35 78 43 29 76 9 8 26 34}}
   {:card 52 :winning-numbers #{22 88 49 1 7 45 23 3 64 60} :numbers #{56 27 50 49 1 12 22 6 88 86 79 41 7 95 80 10 62 44 17 58 34 68 60 84 40}}
   {:card 53 :winning-numbers #{81 76 59 46 73 88 32 6 58 31} :numbers #{32 66 56 87 73 67 6 46 37 99 71 89 88 76 94 75 80 2 81 60 59 58 21 31 39}}
   {:card 54 :winning-numbers #{78 87 85 24 33 79 65 26 27 80} :numbers #{80 29 86 89 33 78 27 16 85 83 63 65 24 75 87 26 97 96 79 55 6 58 48 66 44}}
   {:card 55 :winning-numbers #{68 57 11 53 44 50 89 90 93 6} :numbers #{29 85 78 28 77 41 96 15 79 9 24 23 81 94 37 34 38 48 43 62 91 50 64 70 55}}
   {:card 56 :winning-numbers #{19 75 44 23 55 85 82 61 62 53} :numbers #{27 33 28 74 49 17 46 47 54 66 38 97 87 3 24 69 29 63 15 21 80 72 58 83 11}}
   {:card 57 :winning-numbers #{31 72 59 89 43 9 40 10 37 68} :numbers #{93 99 83 21 59 11 10 91 71 68 16 87 14 12 85 86 8 34 7 89 5 81 31 62 9}}
   {:card 58 :winning-numbers #{87 29 96 83 21 94 62 89 46 7} :numbers #{21 62 98 81 2 69 77 5 87 79 29 88 9 3 68 27 94 38 78 85 39 76 25 61 15}}
   {:card 59 :winning-numbers #{34 88 98 28 32 25 78 46 24 3} :numbers #{28 84 2 39 40 64 79 46 20 77 16 54 26 25 44 21 45 56 43 58 9 85 36 99 49}}
   {:card 60 :winning-numbers #{81 84 80 29 13 19 83 28 85 76} :numbers #{71 25 85 68 83 21 99 58 43 64 5 80 57 3 8 70 78 39 24 92 81 45 56 88 98}}
   {:card 61 :winning-numbers #{94 4 9 77 20 96 88 80 69 34} :numbers #{33 87 49 37 35 57 3 84 13 44 17 81 59 10 20 94 79 95 78 91 66 75 16 1 71}}
   {:card 62 :winning-numbers #{45 37 41 78 6 91 7 95 88 65} :numbers #{27 21 97 22 11 10 29 54 24 59 32 87 42 39 80 92 62 51 8 53 81 91 17 50 4}}
   {:card 63 :winning-numbers #{76 28 2 43 54 4 99 89 16 21} :numbers #{57 8 63 52 56 16 1 11 68 82 66 18 98 71 75 13 92 17 64 12 72 45 50 73 48}}
   {:card 64 :winning-numbers #{92 71 31 54 89 29 76 85 88 97} :numbers #{96 99 77 56 5 50 74 20 79 69 58 60 48 37 7 61 49 43 6 9 75 35 72 34 93}}
   {:card 65 :winning-numbers #{39 40 94 18 77 88 26 23 98 24} :numbers #{77 10 24 39 26 89 29 6 57 71 5 34 88 76 27 40 7 9 44 94 96 23 53 98 18}}
   {:card 66 :winning-numbers #{12 36 17 45 62 50 60 30 44 34} :numbers #{60 78 36 4 35 95 12 38 50 54 41 72 17 55 94 67 45 44 33 62 11 34 30 42 19}}
   {:card 67 :winning-numbers #{25 78 24 13 1 68 94 63 16 54} :numbers #{79 78 7 83 24 13 45 42 18 68 1 54 58 25 69 73 95 26 47 23 70 63 94 16 9}}
   {:card 68 :winning-numbers #{3 68 70 36 31 81 83 6 18 26} :numbers #{39 26 6 65 47 81 5 79 85 62 60 12 23 19 96 8 86 20 83 84 88 99 61 36 32}}
   {:card 69 :winning-numbers #{72 59 95 43 82 18 34 36 66 22} :numbers #{43 81 57 36 95 89 34 22 69 11 17 74 35 40 66 80 82 97 72 38 54 32 86 52 20}}
   {:card 70 :winning-numbers #{63 77 33 31 98 80 37 25 22 19} :numbers #{22 6 12 63 1 56 20 23 17 25 29 7 48 33 37 81 31 80 73 77 98 19 91 15 41}}
   {:card 71 :winning-numbers #{99 22 50 60 61 46 63 84 29 82} :numbers #{65 59 93 16 75 36 29 32 6 69 94 81 67 98 37 87 55 14 77 46 91 48 35 54 22}}
   {:card 72 :winning-numbers #{1 98 62 86 29 42 19 31 45 74} :numbers #{24 58 8 65 21 53 17 75 84 41 69 95 48 63 91 23 80 76 56 27 15 1 3 51 49}}
   {:card 73 :winning-numbers #{39 15 81 50 45 24 47 5 14 33} :numbers #{4 58 70 13 7 82 63 77 96 86 60 84 99 54 34 71 22 19 51 39 27 75 94 10 44}}
   {:card 74 :winning-numbers #{13 16 26 32 78 79 56 66 81 42} :numbers #{19 16 68 15 78 17 56 79 70 35 22 13 41 81 26 76 12 36 62 8 31 32 42 52 66}}
   {:card 75 :winning-numbers #{60 94 85 66 28 10 1 72 95 73} :numbers #{9 63 40 72 26 6 77 98 68 4 97 99 13 65 74 16 59 3 56 66 2 42 37 43 89}}
   {:card 76 :winning-numbers #{11 52 55 68 91 44 37 27 69 22} :numbers #{39 4 69 82 41 93 23 96 85 59 26 8 54 63 21 75 55 12 84 42 86 19 72 60 97}}
   {:card 77 :winning-numbers #{10 67 4 35 16 92 17 48 53 57} :numbers #{62 38 35 22 23 71 49 3 10 98 13 29 33 88 61 37 72 90 54 24 21 87 60 5 12}}
   {:card 78 :winning-numbers #{15 24 23 7 13 22 99 9 35 34} :numbers #{94 72 24 81 30 42 49 74 41 83 19 9 69 40 97 13 62 14 26 15 8 21 44 56 34}}
   {:card 79 :winning-numbers #{12 77 79 91 48 42 70 80 45 56} :numbers #{80 81 70 67 25 59 42 48 34 84 2 79 40 26 45 12 90 53 62 17 93 56 98 77 16}}
   {:card 80 :winning-numbers #{93 49 48 53 80 61 96 32 65 35} :numbers #{96 28 40 90 23 53 68 32 50 12 41 15 67 16 35 87 56 44 42 30 80 97 7 71 61}}
   {:card 81 :winning-numbers #{59 9 95 44 51 29 94 47 71 25} :numbers #{8 46 51 50 11 44 71 55 33 9 25 95 88 67 82 58 77 69 49 96 97 70 78 12 90}}
   {:card 82 :winning-numbers #{85 37 91 6 22 72 74 92 3 47} :numbers #{38 4 35 32 65 86 89 50 95 7 18 67 22 46 84 99 8 74 43 70 13 12 92 52 81}}
   {:card 83 :winning-numbers #{96 50 6 93 23 9 72 36 94 10} :numbers #{86 62 75 40 39 68 95 23 65 33 4 26 1 50 9 14 85 82 83 72 43 31 87 10 29}}
   {:card 84 :winning-numbers #{1 97 71 30 44 47 81 85 14 90} :numbers #{37 98 64 71 5 89 16 66 52 77 9 4 21 96 41 69 53 23 33 31 67 68 97 40 90}}
   {:card 85 :winning-numbers #{9 40 80 70 10 36 13 20 35 21} :numbers #{24 60 15 37 6 40 39 52 8 69 13 10 85 65 12 90 82 58 42 79 89 56 75 62 76}}
   {:card 86 :winning-numbers #{85 54 51 56 30 70 95 24 25 86} :numbers #{24 19 96 3 64 84 62 91 63 73 31 5 85 98 23 22 15 93 2 27 76 36 48 43 94}}
   {:card 87 :winning-numbers #{18 7 34 24 86 45 78 60 76 77} :numbers #{24 26 2 6 4 30 71 89 52 92 46 56 44 51 55 32 88 59 64 75 12 93 42 81 29}}
   {:card 88 :winning-numbers #{31 98 43 82 87 28 77 29 6 63} :numbers #{75 49 51 95 86 97 69 46 2 68 93 17 80 41 89 96 18 47 71 52 15 48 83 30 44}}
   {:card 89 :winning-numbers #{72 94 63 23 50 84 1 64 51 5} :numbers #{59 89 54 55 66 77 65 28 46 83 1 57 58 7 32 56 33 97 2 78 15 98 26 71 88}}
   {:card 90 :winning-numbers #{5 81 46 18 3 15 38 33 68 70} :numbers #{14 35 36 94 5 1 28 17 18 42 62 74 22 39 6 7 76 80 9 55 84 65 10 25 69}}
   {:card 91 :winning-numbers #{38 65 85 67 6 43 33 61 12 45} :numbers #{20 47 61 68 87 73 79 34 77 33 52 86 9 38 85 51 30 90 17 75 45 28 50 92 67}}
   {:card 92 :winning-numbers #{89 95 63 94 37 19 60 61 99 69} :numbers #{7 97 1 46 32 80 58 84 23 62 36 73 64 66 38 20 47 93 16 88 9 13 50 29 98}}
   {:card 93 :winning-numbers #{3 52 96 74 63 1 39 61 99 97} :numbers #{95 28 99 47 35 55 1 38 31 50 96 97 64 63 61 8 3 22 33 23 74 39 66 46 24}}
   {:card 94 :winning-numbers #{93 15 9 14 53 62 45 26 64 3} :numbers #{15 26 9 40 63 53 45 5 80 87 62 3 8 93 23 25 14 92 48 20 41 69 24 43 64}}
   {:card 95 :winning-numbers #{36 4 53 58 10 86 2 16 68 22} :numbers #{16 1 40 38 53 20 99 66 58 80 85 17 6 78 93 28 10 22 36 57 4 98 68 94 86}}
   {:card 96 :winning-numbers #{72 18 52 2 43 44 9 77 99 30} :numbers #{66 39 30 33 2 9 64 36 77 45 22 95 18 42 93 72 52 83 55 99 43 44 26 89 14}}
   {:card 97 :winning-numbers #{64 82 55 43 33 7 61 11 84 57} :numbers #{77 94 59 89 34 64 33 18 1 7 61 55 82 20 78 30 72 84 99 92 95 11 79 43 57}}
   {:card 98 :winning-numbers #{54 12 29 6 71 59 45 60 98 41} :numbers #{94 70 54 99 98 6 3 51 1 14 71 29 61 83 9 81 60 45 12 62 59 41 36 4 43}}
   {:card 99 :winning-numbers #{37 78 19 25 73 70 59 14 51 46} :numbers #{13 7 32 42 64 30 31 11 9 91 6 51 36 68 17 92 52 70 83 96 74 54 93 25 48}}
   {:card 100 :winning-numbers #{39 37 69 45 28 99 35 89 49 87} :numbers #{17 25 68 46 65 44 38 4 66 41 48 81 15 1 93 8 6 52 35 73 13 36 64 74 39}}
   {:card 101 :winning-numbers #{88 58 16 11 59 64 74 34 77 60} :numbers #{24 43 14 21 37 28 9 12 40 92 94 32 5 4 36 87 95 8 80 38 73 54 23 6 15}}
   {:card 102 :winning-numbers #{84 26 44 74 21 67 95 80 57 65} :numbers #{60 75 6 63 86 32 91 21 50 89 69 2 76 51 26 15 83 58 19 64 10 18 27 84 80}}
   {:card 103 :winning-numbers #{6 65 36 86 91 30 68 70 20 34} :numbers #{5 64 81 89 15 97 91 57 86 28 60 79 23 4 51 93 65 49 37 59 73 34 46 2 12}}
   {:card 104 :winning-numbers #{85 93 8 6 60 87 99 18 7 37} :numbers #{77 28 48 34 89 66 19 98 55 24 84 25 54 76 61 58 45 57 65 90 41 6 9 39 14}}
   {:card 105 :winning-numbers #{87 6 92 53 14 51 4 52 37 71} :numbers #{56 88 32 22 15 36 97 5 29 61 16 83 50 71 91 58 96 76 7 48 37 68 35 84 77}}
   {:card 106 :winning-numbers #{53 42 62 70 21 50 40 7 10 81} :numbers #{65 72 86 3 82 1 74 33 5 57 4 68 22 9 78 59 36 56 31 66 45 47 38 55 8}}
   {:card 107 :winning-numbers #{60 28 38 22 78 27 67 96 66 9} :numbers #{70 86 35 64 92 24 57 31 6 14 49 66 36 29 47 16 80 81 41 95 51 44 72 58 68}}
   {:card 108 :winning-numbers #{37 39 66 82 3 8 76 96 32 24} :numbers #{27 70 95 55 9 7 43 62 63 61 6 92 98 1 20 36 41 17 49 44 42 64 35 67 85}}
   {:card 109 :winning-numbers #{88 80 78 7 15 8 61 31 97 39} :numbers #{97 84 74 6 8 88 80 5 70 13 51 45 14 33 78 87 31 61 12 95 68 23 15 39 7}}
   {:card 110 :winning-numbers #{32 33 53 3 70 17 30 59 31 19} :numbers #{73 15 49 6 19 17 46 99 63 29 53 9 35 33 90 87 67 3 94 57 77 24 39 75 84}}
   {:card 111 :winning-numbers #{68 91 78 39 65 11 26 61 19 37} :numbers #{62 37 53 83 78 69 31 39 4 65 19 11 72 5 1 7 10 70 94 91 51 48 68 56 61}}
   {:card 112 :winning-numbers #{1 51 67 84 11 31 28 60 21 52} :numbers #{36 96 4 67 97 60 77 65 55 1 31 33 99 87 69 63 48 61 41 51 85 17 52 64 28}}
   {:card 113 :winning-numbers #{5 68 86 22 93 58 61 29 32 63} :numbers #{5 47 68 27 29 93 58 32 22 84 63 43 86 1 28 81 13 89 61 71 48 66 79 10 8}}
   {:card 114 :winning-numbers #{68 62 9 50 75 80 94 27 1 25} :numbers #{56 58 63 94 15 45 30 46 49 71 75 76 77 33 27 55 28 5 53 93 8 65 11 7 13}}
   {:card 115 :winning-numbers #{40 13 36 49 51 92 62 10 14 3} :numbers #{40 99 13 85 56 68 70 36 47 51 92 32 11 62 49 96 9 98 74 73 58 10 14 86 3}}
   {:card 116 :winning-numbers #{5 70 2 1 82 54 68 50 23 38} :numbers #{15 36 43 23 78 74 24 48 37 34 47 41 21 30 32 40 98 73 88 42 28 53 14 7 71}}
   {:card 117 :winning-numbers #{30 89 51 93 63 67 24 61 64 2} :numbers #{55 46 18 2 73 64 93 30 33 10 17 61 63 15 62 78 67 23 24 95 16 51 89 27 13}}
   {:card 118 :winning-numbers #{10 25 8 75 57 80 24 31 15 87} :numbers #{73 75 23 64 86 37 62 74 39 91 29 67 30 76 18 79 54 55 93 68 40 56 4 53 8}}
   {:card 119 :winning-numbers #{15 3 65 84 33 60 93 24 68 6} :numbers #{39 24 60 48 71 9 49 30 81 86 16 41 23 17 33 56 54 57 61 67 78 31 42 58 64}}
   {:card 120 :winning-numbers #{1 99 53 80 56 86 40 93 41 91} :numbers #{50 95 37 96 42 91 71 7 34 83 40 67 8 24 99 23 80 56 48 88 38 58 46 93 6}}
   {:card 121 :winning-numbers #{96 74 47 38 79 35 11 95 77 8} :numbers #{77 70 23 37 1 3 27 93 79 78 80 26 45 34 83 75 32 82 95 38 36 35 8 96 16}}
   {:card 122 :winning-numbers #{72 9 69 79 5 6 84 62 60 49} :numbers #{23 82 43 58 94 40 97 88 16 77 18 68 87 41 36 17 67 10 33 51 73 98 11 85 35}}
   {:card 123 :winning-numbers #{91 14 61 41 65 77 73 83 9 63} :numbers #{14 80 89 42 60 57 72 44 99 77 95 17 31 33 28 8 96 2 91 6 84 19 36 9 76}}
   {:card 124 :winning-numbers #{38 79 57 16 24 66 53 87 86 82} :numbers #{66 87 3 25 84 9 49 42 10 82 58 78 60 16 86 35 19 92 48 91 75 12 43 45 32}}
   {:card 125 :winning-numbers #{45 46 26 7 38 88 22 35 37 61} :numbers #{97 45 66 57 17 9 52 35 58 19 56 26 94 71 75 5 38 70 36 33 88 90 24 78 6}}
   {:card 126 :winning-numbers #{82 79 41 90 25 93 48 31 4 89} :numbers #{15 61 53 29 30 78 59 26 14 43 68 65 87 8 62 32 80 36 18 3 45 67 84 10 16}}
   {:card 127 :winning-numbers #{79 46 44 63 70 53 56 62 43 66} :numbers #{64 59 15 6 98 77 73 23 24 65 38 54 11 27 19 3 81 37 61 56 34 29 68 32 1}}
   {:card 128 :winning-numbers #{24 35 33 23 10 55 69 9 94 34} :numbers #{20 44 42 15 38 18 87 5 64 40 93 3 54 25 29 4 41 50 14 88 91 63 32 83 92}}
   {:card 129 :winning-numbers #{58 26 88 4 64 24 55 75 10 31} :numbers #{25 9 83 1 40 21 8 30 11 66 35 23 82 99 48 18 49 17 70 3 76 65 44 46 14}}
   {:card 130 :winning-numbers #{61 93 73 2 14 30 74 23 70 20} :numbers #{42 72 98 82 76 9 58 38 62 34 39 26 15 31 84 18 22 35 32 87 79 46 86 55 94}}
   {:card 131 :winning-numbers #{60 3 38 43 96 77 56 94 12 85} :numbers #{25 52 5 13 77 58 15 1 47 19 26 78 7 4 33 87 40 92 72 98 81 11 38 71 55}}
   {:card 132 :winning-numbers #{32 92 27 46 63 41 71 45 29 83} :numbers #{85 94 63 16 45 27 46 92 5 58 41 43 34 62 71 84 4 29 38 48 32 83 78 86 89}}
   {:card 133 :winning-numbers #{55 54 13 84 18 72 69 11 46 24} :numbers #{30 50 77 8 88 46 28 16 54 95 84 69 25 33 19 66 55 11 61 24 72 13 17 18 87}}
   {:card 134 :winning-numbers #{22 57 51 21 48 66 24 79 58 41} :numbers #{20 4 16 57 23 66 3 67 56 73 36 39 22 88 65 45 87 62 27 19 84 97 29 79 21}}
   {:card 135 :winning-numbers #{27 42 87 97 50 62 95 77 59 5} :numbers #{83 97 23 25 27 40 96 59 62 95 36 9 85 68 87 42 54 30 5 50 75 77 38 57 37}}
   {:card 136 :winning-numbers #{39 4 14 17 7 81 12 18 87 59} :numbers #{98 59 34 94 4 39 87 44 79 50 96 67 17 7 12 18 70 2 13 19 30 81 14 37 48}}
   {:card 137 :winning-numbers #{28 15 18 16 47 82 58 98 24 22} :numbers #{86 23 53 85 67 5 15 51 87 83 2 14 94 72 50 6 57 9 1 25 37 80 48 29 31}}
   {:card 138 :winning-numbers #{47 42 92 1 65 79 26 22 62 35} :numbers #{47 62 29 79 21 33 83 42 56 93 81 22 92 58 26 14 63 95 20 65 52 35 60 13 1}}
   {:card 139 :winning-numbers #{4 18 33 2 24 13 26 99 73 65} :numbers #{35 23 10 16 43 94 98 53 55 9 51 65 68 31 37 17 6 33 15 12 97 81 99 77 74}}
   {:card 140 :winning-numbers #{4 64 47 57 95 25 21 15 98 33} :numbers #{90 20 79 32 47 8 14 61 56 43 58 39 40 69 34 53 81 6 1 72 70 67 75 74 42}}
   {:card 141 :winning-numbers #{85 31 79 11 41 81 46 9 10 70} :numbers #{38 85 77 30 70 92 10 9 46 86 45 79 19 97 31 74 5 67 15 41 73 66 11 8 14}}
   {:card 142 :winning-numbers #{95 91 70 34 85 27 30 54 7 87} :numbers #{55 15 33 45 24 35 6 56 28 1 8 48 9 65 82 80 75 22 46 23 10 37 83 78 76}}
   {:card 143 :winning-numbers #{49 46 6 57 67 28 64 68 12 27} :numbers #{67 78 91 70 4 55 3 86 6 48 64 56 21 46 9 50 95 49 27 32 14 59 33 25 98}}
   {:card 144 :winning-numbers #{32 43 10 98 79 27 97 88 47 54} :numbers #{26 97 66 61 22 29 81 12 99 52 40 28 90 9 88 96 30 1 53 15 48 67 82 57 46}}
   {:card 145 :winning-numbers #{92 3 45 6 30 64 98 33 49 39} :numbers #{19 34 12 89 96 2 59 36 37 7 73 41 53 14 46 81 22 24 17 66 10 86 51 47 60}}
   {:card 146 :winning-numbers #{66 20 93 65 53 56 37 5 6 51} :numbers #{12 54 51 23 91 40 73 20 37 67 8 47 53 31 70 60 58 36 89 16 61 88 17 39 98}}
   {:card 147 :winning-numbers #{86 93 34 56 7 84 73 78 80 9} :numbers #{76 10 97 36 77 67 49 99 87 28 35 26 13 74 72 90 41 83 25 73 68 56 8 63 66}}
   {:card 148 :winning-numbers #{42 27 97 56 50 77 29 59 38 82} :numbers #{56 91 65 41 25 26 74 8 52 53 30 86 34 17 19 75 96 61 6 83 15 57 81 31 66}}
   {:card 149 :winning-numbers #{5 99 87 72 12 89 85 76 88 50} :numbers #{40 6 84 93 73 91 92 48 71 54 10 32 69 7 65 12 1 9 98 60 22 28 41 61 21}}
   {:card 150 :winning-numbers #{44 29 36 43 8 85 98 13 70 32} :numbers #{94 99 84 21 75 66 69 26 38 28 47 16 64 3 63 45 2 67 72 34 77 65 86 14 52}}
   {:card 151 :winning-numbers #{69 92 68 12 74 50 54 25 48 99} :numbers #{25 54 16 99 69 35 47 68 30 31 92 74 15 48 64 43 70 51 80 37 50 95 12 57 72}}
   {:card 152 :winning-numbers #{15 28 38 29 61 89 57 34 7 81} :numbers #{12 39 28 16 29 3 25 42 7 80 11 38 62 81 72 36 4 55 88 35 82 89 23 67 57}}
   {:card 153 :winning-numbers #{92 85 16 3 36 7 29 48 43 45} :numbers #{74 11 39 69 24 76 23 80 82 88 53 59 52 4 13 71 90 97 56 61 7 51 14 66 31}}
   {:card 154 :winning-numbers #{34 51 19 90 13 97 77 16 30 73} :numbers #{59 90 10 48 6 73 97 21 51 71 18 68 77 83 37 13 30 44 16 19 5 34 54 62 53}}
   {:card 155 :winning-numbers #{1 35 78 70 3 71 13 53 88 44} :numbers #{85 3 42 87 99 35 81 64 44 80 58 45 9 50 10 23 54 13 95 96 57 51 78 60 90}}
   {:card 156 :winning-numbers #{22 68 41 81 61 8 17 45 34 67} :numbers #{48 45 68 26 61 75 64 34 80 22 81 88 52 24 17 67 4 8 56 3 41 70 40 94 44}}
   {:card 157 :winning-numbers #{54 63 93 3 17 47 27 48 31 59} :numbers #{40 78 99 43 59 17 71 63 85 54 83 58 31 52 56 29 27 24 42 3 47 93 89 48 32}}
   {:card 158 :winning-numbers #{17 46 57 23 11 99 7 35 29 8} :numbers #{8 54 55 50 74 29 63 87 59 22 14 72 79 73 20 56 60 11 68 41 4 26 31 5 62}}
   {:card 159 :winning-numbers #{23 43 41 42 57 19 46 59 22 88} :numbers #{99 96 51 77 57 43 68 10 95 76 19 59 41 46 88 36 58 44 23 94 42 22 7 31 35}}
   {:card 160 :winning-numbers #{63 47 33 78 20 46 60 7 74 34} :numbers #{33 30 70 26 34 43 20 78 63 9 98 74 35 72 46 7 25 62 2 91 60 44 47 94 96}}
   {:card 161 :winning-numbers #{55 35 65 41 30 49 44 18 66 67} :numbers #{41 72 18 77 73 30 65 68 97 44 70 35 15 49 81 55 67 83 62 47 19 66 50 28 95}}
   {:card 162 :winning-numbers #{66 67 63 42 11 50 10 82 18 20} :numbers #{41 10 50 29 82 18 76 98 60 70 64 86 90 42 11 67 62 22 17 77 20 33 66 19 27}}
   {:card 163 :winning-numbers #{21 12 8 87 73 45 90 49 89 44} :numbers #{74 15 48 23 66 96 63 92 42 9 18 54 6 72 94 14 67 76 71 70 31 52 55 57 24}}
   {:card 164 :winning-numbers #{8 57 34 59 61 5 89 37 48 78} :numbers #{91 12 94 98 39 61 75 2 81 47 82 78 19 9 4 52 58 60 64 63 54 86 38 66 68}}
   {:card 165 :winning-numbers #{25 74 37 58 75 11 43 94 41 93} :numbers #{48 20 21 13 70 61 63 53 44 92 65 87 30 4 3 96 15 37 19 90 14 7 67 69 52}}
   {:card 166 :winning-numbers #{66 52 49 56 45 91 68 74 42 62} :numbers #{71 24 22 30 65 19 28 15 27 85 98 3 59 91 61 83 36 38 64 72 88 2 13 23 8}}
   {:card 167 :winning-numbers #{14 52 73 13 66 78 94 75 77 47} :numbers #{87 43 51 20 42 58 78 47 24 71 22 32 3 54 97 56 29 33 75 68 1 31 69 96 2}}
   {:card 168 :winning-numbers #{17 28 87 86 62 78 90 80 91 93} :numbers #{41 27 24 88 62 93 15 13 6 5 22 3 57 74 58 1 86 66 4 54 85 9 84 44 61}}
   {:card 169 :winning-numbers #{66 53 21 98 93 6 10 33 1 38} :numbers #{98 79 7 99 64 55 29 61 57 63 85 91 50 46 15 48 10 95 34 36 44 81 27 69 16}}
   {:card 170 :winning-numbers #{90 78 38 94 40 86 17 80 75 84} :numbers #{20 4 23 79 11 89 21 87 1 50 15 82 56 7 60 10 76 32 30 64 22 88 26 49 55}}
   {:card 171 :winning-numbers #{89 24 37 14 35 15 51 75 81 38} :numbers #{8 95 61 43 72 39 59 32 1 84 63 20 55 33 17 45 60 98 41 2 48 44 71 27 18}}
   {:card 172 :winning-numbers #{32 53 5 76 97 90 75 37 1 89} :numbers #{16 52 10 6 98 12 20 9 96 44 84 38 37 60 87 22 72 28 35 94 70 65 41 67 86}}
   {:card 173 :winning-numbers #{30 87 95 75 17 56 77 64 22 49} :numbers #{52 6 78 29 91 4 69 36 53 71 94 96 14 25 55 47 12 92 34 27 31 58 73 37 83}}
   {:card 174 :winning-numbers #{66 57 29 60 36 47 14 97 73 17} :numbers #{40 28 26 81 6 86 54 75 5 12 64 19 82 41 46 32 1 44 39 96 61 53 18 43 67}}
   {:card 175 :winning-numbers #{31 37 7 14 25 11 68 67 19 36} :numbers #{80 17 34 83 14 11 79 36 91 59 64 58 73 37 99 12 41 67 5 31 25 7 33 68 19}}
   {:card 176 :winning-numbers #{41 73 88 38 25 14 94 61 96 55} :numbers #{73 28 97 81 58 94 55 96 50 69 37 67 79 66 30 59 71 10 14 25 88 61 38 41 16}}
   {:card 177 :winning-numbers #{20 86 57 59 93 17 31 53 90 5} :numbers #{60 35 80 91 86 79 17 65 1 31 93 5 57 8 53 64 20 81 29 13 21 63 59 90 74}}
   {:card 178 :winning-numbers #{56 26 38 71 98 91 52 6 13 5} :numbers #{58 7 84 1 54 70 49 16 32 96 39 78 15 20 22 82 95 93 21 68 42 29 88 48 12}}
   {:card 179 :winning-numbers #{51 28 25 81 79 61 80 52 90 57} :numbers #{52 43 81 90 51 57 78 69 15 50 80 73 35 92 77 25 11 14 79 10 30 28 61 48 87}}
   {:card 180 :winning-numbers #{15 58 35 40 7 30 73 72 19 69} :numbers #{60 5 78 55 49 45 84 77 62 11 97 56 57 32 26 93 76 65 80 16 87 91 41 51 18}}
   {:card 181 :winning-numbers #{93 19 33 58 20 72 16 62 60 90} :numbers #{48 25 50 60 33 32 16 90 83 81 38 19 4 20 92 99 58 93 22 47 62 8 72 56 75}}
   {:card 182 :winning-numbers #{53 47 67 48 32 35 51 63 34 65} :numbers #{36 9 92 32 67 65 71 54 26 44 35 25 63 69 8 47 48 34 85 49 42 59 51 99 53}}
   {:card 183 :winning-numbers #{26 38 36 97 73 31 50 4 19 46} :numbers #{35 59 36 37 17 73 99 66 22 88 29 40 50 96 92 32 75 85 5 47 53 84 2 69 44}}
   {:card 184 :winning-numbers #{77 31 80 46 17 38 29 10 95 63} :numbers #{52 49 42 74 93 8 79 30 2 90 70 72 9 87 37 81 92 3 31 91 15 68 54 69 96}}
   {:card 185 :winning-numbers #{3 28 46 30 59 14 55 70 32 63} :numbers #{81 7 54 12 4 79 27 11 16 58 73 33 45 22 8 61 29 10 47 87 6 89 34 1 44}}
   {:card 186 :winning-numbers #{43 15 95 46 72 98 88 32 19 92} :numbers #{17 43 3 92 5 14 6 44 9 13 68 41 59 28 53 24 81 62 61 11 7 63 96 23 12}}
   {:card 187 :winning-numbers #{10 48 59 87 20 40 15 31 39 57} :numbers #{15 30 42 2 74 35 78 65 14 53 45 76 29 11 34 48 55 10 86 17 66 72 22 32 89}}
   {:card 188 :winning-numbers #{92 82 12 52 35 50 66 17 5 45} :numbers #{73 21 92 57 5 12 69 94 88 51 45 29 22 13 15 27 74 50 25 53 82 66 35 62 55}}
   {:card 189 :winning-numbers #{43 25 90 61 67 28 31 15 75 62} :numbers #{83 50 15 77 27 18 13 99 8 82 63 78 58 84 53 69 97 17 31 57 94 3 49 67 47}}
   {:card 190 :winning-numbers #{23 7 97 33 91 82 37 35 20 19} :numbers #{66 47 76 80 94 69 24 33 96 81 6 23 55 17 7 57 9 97 1 37 32 85 39 63 91}}
   {:card 191 :winning-numbers #{9 13 80 21 31 39 23 70 4 34} :numbers #{23 10 87 85 95 31 39 60 76 73 80 12 86 20 84 28 5 65 59 94 19 56 54 61 36}}
   {:card 192 :winning-numbers #{82 39 58 98 8 42 44 11 80 71} :numbers #{81 60 25 76 86 15 70 8 95 42 34 97 20 72 29 39 98 94 61 33 2 87 4 73 47}}
   {:card 193 :winning-numbers #{89 65 23 47 93 86 51 26 94 10} :numbers #{38 51 81 22 9 28 97 70 20 63 90 8 55 85 66 4 49 50 52 69 54 83 17 2 21}}
   {:card 194 :winning-numbers #{5 36 20 85 62 13 9 25 95 33} :numbers #{43 52 44 31 41 54 22 56 82 59 50 66 84 46 17 53 92 28 45 24 1 9 83 72 48}}
   {:card 195 :winning-numbers #{34 6 40 88 78 49 59 73 68 51} :numbers #{54 60 27 15 32 56 72 20 45 30 17 89 94 4 63 18 26 12 41 47 44 38 70 14 28}}
   {:card 196 :winning-numbers #{8 6 50 43 64 36 68 14 16 82} :numbers #{89 28 90 26 58 59 41 97 30 98 60 69 39 79 61 65 21 10 72 70 54 2 84 25 5}}
   {:card 197 :winning-numbers #{39 93 1 72 52 38 34 80 98 5} :numbers #{40 72 89 75 32 34 59 14 87 39 1 98 24 70 36 37 6 93 38 71 60 15 80 25 10}}
   {:card 198 :winning-numbers #{16 75 48 28 6 87 23 55 13 44} :numbers #{48 69 55 40 6 64 88 66 58 13 49 65 62 78 10 97 16 1 57 90 4 37 54 44 74}}
   {:card 199 :winning-numbers #{25 89 5 87 17 95 33 3 79 55} :numbers #{33 27 76 67 34 79 16 51 28 86 53 97 88 55 22 10 62 14 3 69 83 29 45 50 24}}
   {:card 200 :winning-numbers #{73 8 91 68 93 89 80 24 10 1} :numbers #{70 65 62 45 55 36 6 21 15 88 92 72 24 94 58 53 95 59 69 43 14 40 83 63 29}}
   {:card 201 :winning-numbers #{58 68 88 94 91 45 46 43 87 47} :numbers #{88 49 97 53 2 85 68 91 3 15 1 43 59 58 20 84 5 45 94 90 81 17 64 92 8}}
   {:card 202 :winning-numbers #{71 11 50 5 31 44 65 21 27 18} :numbers #{43 71 5 65 98 74 6 39 45 79 76 21 92 94 75 17 11 70 32 36 27 48 50 18 97}}
   {:card 203 :winning-numbers #{48 83 22 17 39 49 36 97 9 18} :numbers #{18 39 26 29 83 9 19 46 22 61 6 37 48 76 49 33 10 17 36 58 86 62 42 78 97}}
   {:card 204 :winning-numbers #{6 79 83 61 90 74 73 44 96 31} :numbers #{73 31 12 27 74 66 78 28 39 5 98 19 3 77 9 18 50 96 44 83 37 6 7 61 79}}
   {:card 205 :winning-numbers #{31 66 8 18 16 78 86 71 84 14} :numbers #{84 64 71 44 9 50 14 61 87 16 81 49 33 78 92 31 66 18 95 62 86 67 22 17 8}}
   {:card 206 :winning-numbers #{70 10 17 50 65 68 89 43 6 76} :numbers #{96 84 29 5 48 53 11 55 85 81 69 34 22 24 94 83 33 71 51 52 60 13 61 16 38}}
   {:card 207 :winning-numbers #{52 60 8 4 89 66 71 65 7 25} :numbers #{22 3 8 54 11 25 2 65 49 38 67 94 4 89 58 41 10 60 52 71 37 28 66 45 7}}
   {:card 208 :winning-numbers #{85 45 65 49 94 46 86 20 78 92} :numbers #{26 93 33 9 12 67 17 1 14 4 82 28 8 7 61 68 50 22 80 2 75 70 58 16 72}}
   {:card 209 :winning-numbers #{28 54 14 59 76 99 27 83 10 22} :numbers #{86 84 15 83 30 54 32 10 33 76 4 41 22 27 26 49 73 17 14 6 85 57 70 99 48}}
   {:card 210 :winning-numbers #{38 33 8 80 27 65 77 55 60 62} :numbers #{55 48 73 37 91 2 49 68 66 12 80 17 13 33 67 41 42 11 47 78 97 87 58 65 19}}
   {:card 211 :winning-numbers #{50 13 37 39 46 2 99 35 3 52} :numbers #{55 63 67 74 93 86 83 46 43 96 60 61 18 81 38 50 48 70 22 34 2 77 59 27 45}}
   {:card 212 :winning-numbers #{58 72 43 19 34 99 78 17 51 76} :numbers #{71 67 53 44 89 97 68 50 7 32 59 72 21 87 4 18 42 22 40 92 2 82 41 77 70}}
   {:card 213 :winning-numbers #{75 26 12 79 40 94 63 99 65 67} :numbers #{76 73 36 1 58 60 42 39 82 55 24 45 14 89 20 64 30 86 18 98 67 32 19 81 92}}
   {:card 214 :winning-numbers #{17 76 35 95 58 28 8 43 22 72} :numbers #{31 33 11 93 89 46 99 74 66 78 4 68 65 64 54 25 82 15 55 53 84 19 9 38 69}}
   {:card 215 :winning-numbers #{54 74 15 45 49 73 99 62 55 8} :numbers #{68 15 57 94 18 6 45 44 37 88 97 93 53 51 16 64 31 99 52 62 36 61 55 76 24}}
   {:card 216 :winning-numbers #{74 42 58 70 62 66 43 4 78 68} :numbers #{95 86 36 52 13 22 6 45 74 2 25 18 99 47 93 26 77 58 63 62 96 73 27 1 94}}
   {:card 217 :winning-numbers #{26 68 4 18 20 49 48 44 75 54} :numbers #{83 36 99 50 66 38 46 13 69 90 61 41 17 5 98 11 87 14 39 84 6 28 77 31 82}}
   {:card 218 :winning-numbers #{33 13 50 29 8 32 69 44 30 17} :numbers #{81 96 70 16 25 28 77 23 19 99 93 61 82 88 26 58 12 30 24 78 97 54 38 90 48}}
   {:card 219 :winning-numbers #{81 72 88 86 7 12 84 74 38 70} :numbers #{67 16 75 25 37 36 26 10 20 99 94 28 79 90 93 68 22 84 47 53 44 82 91 97 8}}
   {:card 220 :winning-numbers #{56 45 18 93 37 22 52 53 66 69} :numbers #{58 79 19 59 9 16 65 24 29 97 88 73 54 83 49 71 15 23 12 57 84 99 35 31 91}}])
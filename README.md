# SMK_java

Komenda C (Create) tworzy kwadrat o numerze i i długości krawędzi j, któ-
rego środek znajduje się w punkcie (0,0). Zastępuje on wcześniejszy kwadrat o
numerze i (jeżeli taki istnieje).

Komenda M (Move) przenosi kwadrat numer i o j pikseli w prawo i k pikseli w
górę. Jeżeli nie ma kwadratu o numerze i to komenda niczego nie robi.

Komenda S (Scale) zwiększa wielkość kwadratu i j razy. Jeżeli nie ma kwadratu 1 o numerze i to komenda niczego nie robi.

Komenda U (Undo) anuluje ostatnią jeszcze nie anulowaną komendę C, M albo
S. Jeżeli nie ma komendy którą można anulować to komenda U niczego nie robi.

Komenda R (Redo) działa jedynie jeżeli ostatnią wykonaną komendą jest U albo
R, w przeciwnym przypadku komenda niczego nie robi. Komenda to wykonuje
ponownie ostatnią anulowaną (i nie wykonaną ponownie z użyciem R) komendę
C, M albo S.

Komenda P (Print) wypisuje na standardowe wyjście informacje o wszystkich
kwadratach w systemie. Kwadraty powinny być wypisane wg rosnącego identy-
fikatora i, każdy w osobnej linii, gdzie każda linia ma następujący format:
i j k l

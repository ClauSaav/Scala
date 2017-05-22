a = []
for i in range(5):
    ingreso = int(input("Ingresa un numero: "))
    a.append(ingreso)

for i in range(1, 5):
    for j in range(0, 5-i):
        if a[j] > a[j + 1]:
            aux = a[j]
            a[j] = a[j + 1]
            a[j + 1] = aux

print("%d,%d,%d,%d,%d" % (a[0],a[1],a[2],a[3],a[4]))

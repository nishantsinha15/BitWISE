def bubble_sort( a = [2,3,1,4,5,3,0] ):
    n = len(a)
    isSorted = False
    while not isSorted:
        isSorted = True
        for i in range(n-1):
            if a[i] > a[i+1]:
                # swap a[i] with a[i+1]
                a[i], a[i+1] = a[i+1], a[i]
                isSorted = False
    return a

sorted_list = bubble_sort()
print(sorted_list)
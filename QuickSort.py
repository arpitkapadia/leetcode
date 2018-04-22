def partition(arr, low, high):
    pivot = arr[high]
    tmp = low
    pivot_index = high
    pivot = arr[high]

    while(tmp < high):
        if(arr[tmp] < pivot):
            if(tmp > pivot_index):
                arr[pivot_index], arr[tmp] = arr[tmp], arr[pivot_index]
                pivot_index = tmp
        else:
            if(pivot_index > tmp):
                arr[pivot_index], arr[tmp] = arr[tmp], arr[pivot_index]
                pivot_index = tmp
        tmp += 1
    print(arr)
    return pivot_index

def quicksort(arr, low, high):

    if(low < high):
        pivot = partition(arr, low, high)
        quicksort(arr, low, pivot-1)
        quicksort(arr, pivot+1, high)
    return arr

if __name__ == '__main__':
    nums = list(map(int, input().split()))
    #print(partition(nums, 0, len(nums)-1))

    print("sorted ", quicksort(nums, 0, len(nums)-1))


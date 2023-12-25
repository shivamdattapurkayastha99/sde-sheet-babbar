# search an element in a row wise and column sorted matrix
def search(mat,n,x):
    i=0
    j=n-1
    while i<n and j>=0:
        if mat[i][j]>x:
            j-=1
        if mat[i][j]==x:
            print("element found at ",i,",",j)
            return 1
        else:
            i+=1
            
    print("Element not found")
    return 0
if __name__=="__main__":
    n=int(input("Enter order of matrix"))
    mat=[[int(input("Enter elements of matrix"))for j in range(n)]for i in range(n)]
    x=int(input("Enter element to be searched"))
    search(mat,n,x)
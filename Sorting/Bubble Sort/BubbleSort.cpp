#include <bits/stdc++.h>
using namespace std;

void bubble(int a[], int n)
{
	bool isSorted = false;
	while(!isSorted)
	{
		isSorted = true;
		for( int i = 0; i < n-1; i++ )
		{
			if(a[i] > a[i+1])
			{
				// Swapping using a third variable
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] =  temp;

				isSorted = false;
			}
		}
	}
}

int main()
{
	int a[7] = {2,3,1,4,5,3,0};
	int n = 7;
	bubble(a, n);

	for(int i = 0; i < n; i++ )
		printf("%d ",a[i]);
	printf("\n");

	return 0;
}
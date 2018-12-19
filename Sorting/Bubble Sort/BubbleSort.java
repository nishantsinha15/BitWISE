class BubbleSort
{
	public void bubble(int a[], int n)
	{
		Boolean isSorted = false;
		while( !isSorted )
		{
			isSorted = true;
			for( int i = 0; i < n-1; i++ )
			{
				if( a[i] > a[i+1] )
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;

					isSorted = false;
				}
			}
		}
	}

	public static void main(String args[])
	{
		int[] a = {2,3,1,4,5,3,0};
		int n = 7;
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubble(a, n);
		for( int i = 0; i < n; i++ )
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
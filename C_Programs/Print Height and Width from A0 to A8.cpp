// to print height and width from A0 to A8

#include<stdio.h>
int main()
{
	int A0h = 1189, A0w = 841, A1h, A1w, A2h, A2w, A3h, A3w, A4h, A4w, A5h, A5w, A6h, A6w, A7h, A7w, A8h, A8w;
	printf("\nA0 Height : %d and Width : %d", A0h, A0w);

	A1h = A0w;
	A1w = A0h/2;
	printf("\nA1 Height : %d and Width : %d", A1h, A1w);

	A2h = A1w;
	A2w = A1h / 2;
	printf("\nA2 Height : %d and Width : %d", A2h, A2w);

	A3h = A2w;
	A3w = A2h / 2;
	printf("\nA3 Height : %d and Width : %d", A3h, A3w);

	A4h = A3w;
	A4w = A3h / 2;
	printf("\nA4 Height : %d and Width : %d", A4h, A4w);

	A5h = A4w;
	A5w = A4h / 2;
	printf("\nA5 Height : %d and Width : %d", A5h, A5w);

	A6h = A5w;
	A6w = A5h / 2;
	printf("\nA6 Height : %d and Width : %d", A6h, A6w);

	A7h = A6w;
	A7w = A6h / 2;
	printf("\nA7 Height : %d and Width : %d", A7h, A7w);

	A8h = A7w;
	A8w = A7h / 2;
	printf("\nA8 Height : %d and Width : %d", A8h, A8w);
	return 0;

}
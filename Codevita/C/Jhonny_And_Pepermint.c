/* Including Main Function Files or Header files */
# include <stdio.h>
# include <math.h>
/* Main Function Code Will Start From Here */
int main(){
	int testcases,pepermints=0,wrappers=0,i,uc=pow(10,4),days;
	/*
	*testcases = number of testcases 
	*pepermints = number of pepermints
	*wrappers = number of wrappers 
	*i = used in for loop
	*uc = upper constraint 10000
	*days = for counting number of days 
	*/
	
	// Getting number of testcases from user
	scanf("%d",&testcases);
	//Starting For loop to run number of test cases
	for(i = 0;i<testcases;i++){
		// Getting Values of pepermints and wrappers from user
		scanf("%d %d",&pepermints,&wrappers);
		// Checking Constraints 
		if(uc < pepermints || uc < wrappers){
			// If Fired Close Program WitH Error Code 1
			return 1;
		}
		//Main Logic Start
		for(days = 0 ; days < pepermints ; days++){
			wrappers++;
			if(wrappers >= 7){
				pepermints++;
				wrappers = 0;  
			}
		}
		// Main Logic End
		//Show User Output
		printf("Pepermints Will Last:%d\n",days);
	}
}

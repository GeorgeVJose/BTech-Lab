#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdlib.h>
#include<errno.h>

void main()
{
	pid_t pid;
	pid = fork();

	if(pid == -1)
	{
		printf("Process creation failed");
	}
	else if(pid==0)
	{
		int j;
		for(j=0; j<10; j++)
		{
			printf("Child : %d \n",j);
			sleep(1);
		}
		_exit(0);
	}
	else
	{
		int i;
		for(i=0; i<10; i++)
		{
			printf("Parent : %d \n", i);
			sleep(1);
		}
		exit(0);
	}
}

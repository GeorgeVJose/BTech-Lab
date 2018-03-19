#include<pthread.h>
#include<stdio.h>
#include<stdlib.h>

void *task1()
{
	printf("Thread 1 created.\n");
}

void *task2()
{
	printf("Thread 2 created.\n");
}

void *task3()
{
	printf("Thread 3 created.\n");
}

void main()
{
	pthread_t thread_1, thread_2, thread_3;
	pthread_create(&thread_1, NULL, task1, NULL);
	pthread_create(&thread_2, NULL, task2, NULL);
	pthread_create(&thread_3, NULL, task3, NULL);
	pthread_join(thread_1, NULL);
	pthread_join(thread_2, NULL);
	pthread_join(thread_3, NULL);
//	pthread_exit(NULL);
}

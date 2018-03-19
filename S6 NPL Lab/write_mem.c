#include <stdio.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <stdio.h>

void main(){
    	key_t key = 1234;
    	int shmid = shmget(key,1024,0666|IPC_CREAT);
    	char *str = (char*) shmat(shmid,(void*)0,0);
    	printf("Enter String : ");
	    gets(str);
	    shmdt(str);
	    printf("Write Complete\n");
}

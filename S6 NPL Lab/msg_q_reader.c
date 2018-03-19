#include <stdio.h>
#include <sys/ipc.h>
#include <sys/msg.h>

struct mesg_buffer {
    long mesg_type;
    char mesg_text[100];
} message;

void main()
{
    key_t key = 1111;
    int msgid = msgget(key, 0666 | IPC_CREAT);
    msgrcv(msgid, &message, sizeof(message), 1, 0);
    printf("Message Received : %s \n", message.mesg_text);
    msgctl(msgid, IPC_RMID, NULL);
}

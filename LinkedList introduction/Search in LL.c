#include <stdio.h>

struct Node* search(struct Node* p, int key) {
    if (p == NULL) {
        return NULL;
    }
    if (key == p->data) {
        return p;
    }
    return search(p->next, key);
}

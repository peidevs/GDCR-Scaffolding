
#include <stdio.h>
#include "minunit.h"
 
/* ---------------------------- */
/* code */

int foo(int x) {
    return x;
}

/* ---------------------------- */
/* test */

int tests_run = 0;
 
static char * test_foo() {
    int result = foo(5150);
    mu_assert("error, result != 5150", result == 5150);
    return 0;
}
 
static char * all_tests() {
    mu_run_test(test_foo);
    return 0;
}

/* ---------------------------- */
/* main */
 
int main(int argc, char **argv) {
    char *result = all_tests();

    if (result != 0) {
        printf("%s\n", result);
    } else {
        printf("ALL TESTS PASSED\n");
    }
    printf("Tests run: %d\n", tests_run);

    return result != 0;
}

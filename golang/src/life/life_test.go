
package main

import "testing"

func TestLife(t *testing.T) {
    cases := []struct {
        in, want int32
    }{
        {5150,5150},
    }
    for _, c := range cases {
        got := Life(c.in)
        if got != c.want {
            t.Errorf("Life(%v) == %v, want %v", c.in, got, c.want)
        }
    }
}

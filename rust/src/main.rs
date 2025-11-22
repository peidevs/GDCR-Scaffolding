use std::cell::Cell;

mod cell;

fn main() {
    let _grid = vec![vec![Cell::new(1); 10]; 10];

    println!("Game of Life");
}

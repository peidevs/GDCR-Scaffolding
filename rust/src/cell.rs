#[derive(Debug)]
struct Cell {
    alive: bool,
}

impl Cell {
    pub fn new(alive: bool) -> Cell {
        Cell { alive }
    }

    pub fn is_alive(&self) -> bool {
        self.alive
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_new_cell() {
        let cell = Cell::new(true);
        assert!(cell.is_alive());

        let dead_cell = Cell::new(false);
        assert!(!dead_cell.is_alive());
    }

    #[test]
    fn test_cell_state() {
        let cell = Cell::new(true);
        assert_eq!(cell.is_alive(), true);

        let dead_cell = Cell::new(false);
        assert_eq!(dead_cell.is_alive(), false);
    }
}

import java.util.Arrays;

public class Map {

    char[][] arr;
    Turtle turtle;

    public Map(int i, int j) {
        this.arr = new char[i][j];
        this.turtle = new Turtle(i, j);
        for (char[] row : this.arr)
            Arrays.fill(row, ' ');
        this.arr[0][0] = '$';
    }

    public void drawMap() {
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length;
            j++){
                System.out.print(String.valueOf(arr[i][j]));
            }
            System.out.println();
        }
    }

        public void doCommand (String command){
            if (command.equals("TOLLAT LE")) {
                this.turtle.setPen(true);
            } else if (command.equals("TOLLAT FEL")) {
                this.turtle.setPen(false);
            } else if (command.equals("TÖRÖL")) {
                for (int i = 0; i < this.arr.length; i++) {
                    for (int j = 0; j < this.arr.length; j++) {
                        if (arr[i][j] == '#') {
                            arr[i][j] = ' ';
                        }
                    }
                }
            } else if (command.startsWith("FEL ")) {
                moveDirection(command);
            } else if (command.startsWith("LE ")) {
                moveDirection(command);
            } else if (command.startsWith("JOBBRA ")) {
                moveDirection(command);
            } else if (command.startsWith("BALRA ")) {
                moveDirection(command);
            } else if (command.startsWith("MENT ")) {
                String[] commands = command.split(" ");
                GameStatus gameStatus = new GameStatus(arr);
                gameStatus.writeFile(commands[1]);
            } else if (command.startsWith("TÖLT ")) {
                String[] commands = command.split(" ");
                GameStatus gameStatus = new GameStatus(arr);
                this.arr = gameStatus.readFile(commands[1], this.arr);
                for ( int i = 0; i < arr.length; i++) {
                    for ( int j = 0; j < arr[i].length; j++) {
                        if ( arr [i][j] == '$'){
                            turtle.setxTurtle(i);
                            turtle.setyTurtle(j);
                        }
                    }
                }
            }
        }

        public void moveDirection(String command){
            String[] str = command.split(" ");
            int n = Integer.parseInt(str[1]);
            for ( int i = 0; i < n; i++) {
                int x = this.turtle.getxTurtle();
                int y = this.turtle.getyTurtle();
                if ( turtle.isPen()) {
                    this.arr[x][y] = '#';
                } else {
                    this.arr[x][y] = ' ';
                }
                turtle.move(str[0]);
                this.arr[turtle.getxTurtle()][turtle.getyTurtle()] = '$';
            }

        }
    }

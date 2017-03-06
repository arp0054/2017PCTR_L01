package p012;

public class Hilos implements Runnable {

	private Ball ball;
	private Board board;

	public Hilos(Ball ball, Board board) {
		this.ball = ball;
		this.board = board;
	}

	@Override
	public void run() {
		try {
			while (true) {
				ball.reflect();
				ball.move();
				board.repaint();

				Thread.sleep(20);

			}
		} catch (InterruptedException e) {
			// e.printStackTrace();
		}

	}

}

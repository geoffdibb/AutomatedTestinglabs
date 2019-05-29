package com.bae.Blackjack.MainApp;

import java.util.Random;

public class BlackJack {
	public static void main(String[] args) {

	}

	public int twist(int dealer) {
		int card=0;
		if (dealer < 16) {
			card = (((int) Math.random() * 11) + 1);
			return card;

		}
		return card;
	}

	public int play(int player, int dealer) {

		if ((player >= 31 && dealer < 21) || dealer < 21 && player < 21 && player < 4) {
			return -1;
		}

		if (player > dealer && player < 22 && dealer >= 4 || dealer > 21 && dealer < 31 && player < 21 && player < 31) {
			return player;
		} else if ((dealer > player && dealer < 22 && dealer >= 4)
				|| player > 21 && player < 31 && dealer < 21 && dealer < 31) {
			return dealer;
		} else if ((dealer > 21 && dealer < 31) && (player > 21 && player < 31) || (player >= 31 && dealer < 21)) {
			return 0;
		}

		else {

			return -1;
		}
	}
}
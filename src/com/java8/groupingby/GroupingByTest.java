package com.java8.groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByTest {

	private static List<Player> playerList;
	static {

		playerList = Arrays.asList(new Player("Dhoni", 38, PlayerType.CRICKTER),
				new Player("Messi", 33, PlayerType.FOOTBALLER), new Player("Ronaldeno", 34, PlayerType.FOOTBALLER),
				new Player("Virat", 30, PlayerType.CRICKTER), new Player("Djokovik", 37, PlayerType.TENNIESER));
	}

	public static void main(String[] args) {

		// group by footballer

		Map<PlayerType, List<Player>> collect = playerList.stream().collect(Collectors.groupingBy(Player::getType));

		
		System.out.println(collect);
		/*collect.forEach((game, player) -> {
			System.out.println(game);
			player.stream().forEach(p -> p.getName());
		});*/

	}

}

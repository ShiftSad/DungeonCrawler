package tech.shiftmc.dungeon

import tech.shiftmc.dungeon.server.Dungeon

private fun boot() {
    Dungeon().boot()
}

fun main(args: Array<String>) = boot()

[TOC]

## Data Type Signed Unsigned



| Data Type | Bits | Unsigned          | Signed                     | Signed Max                                 |
| --------- | ---- | ----------------- | -------------------------- | ------------------------------------------ |
| `byte`    | 8    | 0 ～ 2 ** 8 -1    | - (2 ** 7 ） ～ 2 ** 7 - 1 | 127 (百)                                   |
| `short`   | 16   | 0 ～ 2 ** 16 - 1  | - (2 ** 15) ~ 2 ** 15 - 1  | 32, 767 （万）                             |
| `int`     | 32   | 0 ～ 2 ** 32 -  1 | - (2 ** 31) ~ 2 ** 31 - 1  | 2, 147, 483, 647 （十亿）                  |
| `long`    | 64   | 0 ～ 2 ** 64 - 1  | - (2 ** 63) ~ 2 ** 63 - 1  | 9, 223, 372, 036, 854, 775, 807 (百万万亿) |



Java中没有原生的 unsigned int。



References:

- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html


DROP ALIAS IF EXISTS GET_RANDOM_NUM;

CREATE ALIAS GET_RANDOM_NUM as $$ Integer pickNum() {Random rand = new Random();return rand.nextInt(50);}$$
^^^ END OF SCRIPT ^^^
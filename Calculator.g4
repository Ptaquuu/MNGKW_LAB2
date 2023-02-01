grammar Calculator;

expression: multiExpression ((PLUS | MINUS) multiExpression)*;
multiExpression: powExpression ((TIMES  | DIV) powExpression)*;
powExpression: function ((POW|SQRT) function)*;
function : funcname floatExpression | floatExpression;

floatExpression: MINUS NUMBER|NUMBER;
NUMBER: ('0' .. '9') + ('.' ('0' .. '9') +)?;

DOT: '.';
POW: '^';
SQRT: 'sqrt';
TIMES: '*' ;
DIV: '/' ;
PLUS: '+' ;
MINUS: '-' ;
WS : [ \t\r\n]+ -> skip ;

COS: 'cos';
SIN: 'sin';
TAN: 'tan';
ACOS: 'acos';
ASIN: 'asin';
ATAN: 'atan';
LOG: 'log';
PI : 'PI';

funcname:
    COS
   | TAN
   | SIN
   | ACOS
   | ATAN
   | ASIN
   | LOG
   | PI
   ;

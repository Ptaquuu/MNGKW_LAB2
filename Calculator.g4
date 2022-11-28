grammar Calculator;

expression: multiExpression ((PLUS | MINUS) multiExpression)*;
multiExpression: powExpression ((TIMES | DIV) powExpression)*;
powExpression: floatExpression ((POW|SQRT) floatExpression)*;

floatExpression: MINUS FLOAT|FLOAT;
FLOAT: ('0' .. '9') + ('.' ('0' .. '9') +)?;

DOT: '.';
POW: '^';
SQRT: 'sqrt';
TIMES: '*' ;
DIV: '/' ;
PLUS: '+' ;
MINUS: '-' ;
INTEGRAL: 'cal';
WS : [ \t\r\n]+ -> skip ;

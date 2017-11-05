#!/usr/bin/python3

fn = 'Kevin'
mn = 'George'
ln = 'Rusty'
on = 'Lee'

bm = 10
bd = 12
by = 1970
age = 47

print('Hello',fn,mn,ln,sep=' ')
print(bm,bd,by,sep='/')

print('My original sir name wasn\'t %s it was %s' %(ln,on) )
print('I was %s %s %s first.\nMy name was changed to %s when I was 9.' %(fn,mn,on,ln))

a = 0

while ( a <= 10 ):
    print('a = %d' % a)
    a+=2
else:
    print('The current value of a is %d' % a)
    print('Done!')

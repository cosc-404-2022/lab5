/* SimpleParserTokenManager.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. SimpleParserTokenManager.java */
package textdb.parser;

/** Token Manager. */
public class SimpleParserTokenManager implements SimpleParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 2;
         return jjMoveNfa_0(5, 0);
      case 10:
         jjmatchedKind = 3;
         return jjMoveNfa_0(5, 0);
      case 13:
         jjmatchedKind = 4;
         return jjMoveNfa_0(5, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(5, 0);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 37:
         jjmatchedKind = 35;
         return jjMoveNfa_0(5, 0);
      case 40:
         jjmatchedKind = 14;
         return jjMoveNfa_0(5, 0);
      case 41:
         jjmatchedKind = 15;
         return jjMoveNfa_0(5, 0);
      case 42:
         jjmatchedKind = 33;
         return jjMoveNfa_0(5, 0);
      case 43:
         jjmatchedKind = 31;
         return jjMoveNfa_0(5, 0);
      case 44:
         jjmatchedKind = 30;
         return jjMoveNfa_0(5, 0);
      case 45:
         jjmatchedKind = 32;
         return jjMoveNfa_0(5, 0);
      case 47:
         jjmatchedKind = 34;
         return jjMoveNfa_0(5, 0);
      case 60:
         jjmatchedKind = 40;
         return jjMoveStringLiteralDfa1_0(0x48000000000L);
      case 61:
         jjmatchedKind = 38;
         return jjMoveNfa_0(5, 0);
      case 62:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 74:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x120000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 88:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 106:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x120000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 120:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 0);
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
         }
         break;
      case 62:
         if ((active0 & 0x40000000000L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 1;
         }
         break;
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 78:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x11000L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0xc2000L);
      case 82:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 110:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x11000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0xc2000L);
      case 114:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 1);
   }
   switch(curChar)
   {
      case 68:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 2;
         }
         break;
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 82:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 2;
         }
         break;
      case 84:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 2;
         }
         break;
      case 100:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 2;
         }
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 114:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 2;
         }
         break;
      case 116:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 2;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 2);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 2);
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa4_0(active0, 0x1100L);
      case 77:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 3;
         }
         break;
      case 78:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 3;
         }
         break;
      case 82:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x1100L);
      case 109:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 3;
         }
         break;
      case 110:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 3;
         }
         break;
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 3);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 3);
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 69:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 4;
         }
         break;
      case 82:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 4;
         }
         break;
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 101:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 4;
         }
         break;
      case 114:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 4;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 4);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 4);
   }
   switch(curChar)
   {
      case 84:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 5;
         }
         break;
      case 116:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 5);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 73;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                     { jjCheckNAddStates(0, 6); }
                  }
                  else if (curChar == 34)
                     { jjCheckNAddStates(7, 10); }
                  else if (curChar == 47)
                     { jjAddStates(11, 12); }
                  else if (curChar == 39)
                     { jjCheckNAddStates(13, 15); }
                  else if (curChar == 46)
                     { jjCheckNAdd(7); }
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 45)
                     { jjCheckNAddStates(16, 18); }
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(16, 18); }
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 3:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if (curChar == 46)
                     { jjCheckNAdd(7); }
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  { jjCheckNAddTwoStates(7, 8); }
                  break;
               case 9:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(10); }
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  { jjCheckNAdd(10); }
                  break;
               case 11:
                  if (curChar == 39)
                     { jjCheckNAddStates(13, 15); }
                  break;
               case 12:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     { jjCheckNAddStates(13, 15); }
                  break;
               case 13:
                  if (curChar == 39)
                     { jjCheckNAddStates(19, 21); }
                  break;
               case 14:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     { jjCheckNAddStates(19, 21); }
                  break;
               case 16:
                  if (curChar == 39 && kind > 24)
                     kind = 24;
                  break;
               case 20:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 30:
                  if (curChar == 47)
                     { jjAddStates(11, 12); }
                  break;
               case 31:
                  if (curChar == 47)
                     { jjCheckNAddStates(22, 24); }
                  break;
               case 32:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(22, 24); }
                  break;
               case 33:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 34:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 35:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 36:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(37, 38); }
                  break;
               case 37:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(37, 38); }
                  break;
               case 38:
                  if (curChar == 42)
                     { jjAddStates(25, 26); }
                  break;
               case 39:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(40, 38); }
                  break;
               case 40:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(40, 38); }
                  break;
               case 41:
                  if (curChar == 47 && kind > 7)
                     kind = 7;
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  { jjCheckNAddStates(0, 6); }
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  { jjCheckNAdd(43); }
                  break;
               case 44:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(44, 45); }
                  break;
               case 45:
                  if (curChar == 46)
                     { jjCheckNAdd(46); }
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  { jjCheckNAddTwoStates(46, 47); }
                  break;
               case 48:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(49); }
                  break;
               case 49:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  { jjCheckNAdd(49); }
                  break;
               case 50:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(50, 51); }
                  break;
               case 52:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(53); }
                  break;
               case 53:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  { jjCheckNAdd(53); }
                  break;
               case 54:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  { jjCheckNAddTwoStates(54, 55); }
                  break;
               case 56:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(57); }
                  break;
               case 57:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  { jjCheckNAdd(57); }
                  break;
               case 59:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAddStates(27, 29); }
                  break;
               case 60:
                  if (curChar == 46)
                     { jjAddStates(30, 31); }
                  break;
               case 62:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAddStates(32, 34); }
                  break;
               case 63:
                  if (curChar == 42 && kind > 25)
                     kind = 25;
                  break;
               case 64:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 63;
                  break;
               case 65:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(66, 67); }
                  break;
               case 66:
                  if ((0xffffff7b00002600L & l) != 0L)
                     { jjCheckNAddTwoStates(66, 67); }
                  break;
               case 67:
                  if (curChar != 34)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAddTwoStates(60, 64); }
                  break;
               case 68:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjstateSet[jjnewStateCnt++] = 68;
                  break;
               case 69:
                  if (curChar == 34)
                     { jjCheckNAddStates(7, 10); }
                  break;
               case 70:
                  if ((0xffffff7b00002600L & l) != 0L)
                     { jjCheckNAddTwoStates(70, 67); }
                  break;
               case 71:
                  if ((0xffffff7b00002600L & l) != 0L)
                     { jjCheckNAddTwoStates(71, 72); }
                  break;
               case 72:
                  if (curChar == 34 && kind > 27)
                     kind = 27;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                     { jjCheckNAddStates(35, 38); }
                  }
                  if ((0x8000000080L & l) != 0L)
                     { jjAddStates(39, 40); }
                  break;
               case 1:
                  { jjAddStates(16, 18); }
                  break;
               case 8:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(41, 42); }
                  break;
               case 12:
                  { jjCheckNAddStates(13, 15); }
                  break;
               case 15:
                  { jjCheckNAddStates(19, 21); }
                  break;
               case 17:
                  if ((0x8000000080L & l) != 0L)
                     { jjAddStates(39, 40); }
                  break;
               case 18:
                  if ((0x200000002000000L & l) != 0L && kind > 11)
                     kind = 11;
                  break;
               case 19:
               case 25:
                  if ((0x400000004L & l) != 0L)
                     { jjCheckNAdd(18); }
                  break;
               case 21:
                  if ((0x1000000010000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 26:
                  if ((0x1000000010000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 32:
                  { jjAddStates(22, 24); }
                  break;
               case 37:
                  { jjCheckNAddTwoStates(37, 38); }
                  break;
               case 39:
               case 40:
                  { jjCheckNAddTwoStates(40, 38); }
                  break;
               case 47:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(43, 44); }
                  break;
               case 51:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(45, 46); }
                  break;
               case 55:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(47, 48); }
                  break;
               case 58:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAddStates(35, 38); }
                  break;
               case 59:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAddStates(27, 29); }
                  break;
               case 61:
               case 62:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAddStates(32, 34); }
                  break;
               case 66:
                  if ((0x3ffffffeefffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(66, 67); }
                  break;
               case 68:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAdd(68); }
                  break;
               case 70:
                  if ((0x3ffffffeefffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(70, 67); }
                  break;
               case 71:
                  if ((0x3ffffffeefffffffL & l) != 0L)
                     { jjAddStates(49, 50); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(16, 18); }
                  break;
               case 12:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddStates(13, 15); }
                  break;
               case 15:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddStates(19, 21); }
                  break;
               case 32:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(22, 24); }
                  break;
               case 37:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddTwoStates(37, 38); }
                  break;
               case 39:
               case 40:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddTwoStates(40, 38); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 73 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, "\50", "\51", null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, "\54", "\53", "\55", "\52", "\57", "\45", "\76", "\76\75", "\75", 
"\74\75", "\74", "\41\75", "\74\76", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   43, 44, 45, 50, 51, 54, 55, 70, 67, 71, 72, 31, 36, 12, 14, 16, 
   1, 2, 4, 14, 15, 16, 32, 33, 35, 39, 41, 59, 60, 64, 61, 65, 
   60, 62, 64, 59, 60, 64, 68, 24, 29, 9, 10, 48, 49, 52, 53, 56, 
   57, 71, 72, 
};

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public SimpleParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public SimpleParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 73; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7ffcf7fff01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[73];
    private final int[] jjstateSet = new int[2 * 73];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}

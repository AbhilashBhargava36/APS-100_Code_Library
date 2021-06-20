#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef unsigned int ui;
unsigned int search(ui numDigits, ui multiplier, ui lastDigit, ui modulo)
{
  ui shift = 10, carry = 0;
  ui current = lastDigit;
  ui result  = lastDigit;
  while (--numDigits)
  {
    auto next = multiplier * current + carry;
    carry     = next / 10;
    current   = next % 10;
    if (shift < modulo)
    {
      result += current * shift;
      shift  *= 10;
    }
  }
  auto first = multiplier * current + carry;
  if (current == 0 || first != lastDigit)
    return 0;
  return result;
}
int main()
{
  ui maxDigits = 100;
  cin >> maxDigits;
  const ui Modulo = 100000;
  ui result = 0;
  for (ui numDigits = 2; numDigits <= maxDigits; numDigits++)
    for (ui multiplier = 1; multiplier <= 9; multiplier++)
      for (ui lastDigit = 1; lastDigit <= 9; lastDigit++)
        result += search(numDigits, multiplier, lastDigit, Modulo);

        cout << result % Modulo << std::endl;
  return 0;
}

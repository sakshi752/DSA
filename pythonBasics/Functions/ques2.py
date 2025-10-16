# Function to check if number is prime.

def isPrime(num):
    if num <= 1:  # 0 and 1 are not prime
        return False
    
    # Check divisibility from 2 to sqrt(num)
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    
    return True
def countWays(n):
    # code here
    dp = [0]*(n+1)
    dp[0] = 1
    dp[1] = 1

    for i in range(2, n+1):
        dp[i] = dp[i-1] + dp[i-2] 
        print("at i:{} dp: {}".format(i, dp[i]))

    return dp[n]

print(countWays(4))

        

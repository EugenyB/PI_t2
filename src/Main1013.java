import java.util.*;

public class Main1013 {
    public static void main(String[] args) {
        new Main1013().run();
    }

    private void run() {
        int n, k, p = 2, i, mn = Integer.MAX_VALUE;
        List<Integer> v = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        Map<Integer, Integer> mp1 = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        while (p <= k) {
            if (k % p == 0) {
                int h = 0;
                while (k % p == 0) {
                    k /= p; h++;
                }
                mp1.put(p,h);
                v.add(p);
            }
            p++;
        }
        for (i = 0; i < v.size(); i++) {
            int num = n;
            while (num != 0) {
                int val = mp.get(v.get(i));
                mp.put(v.get(i), val + num / v.get(i));
                num /= v.get(i);
            }
        }
        for (i = 0; i < v.size(); i++) {
            mn = Math.min(mn, mp.get(v.get(i)) / mp1.get(v.get(i)));
        }
        System.out.println(mn);
    }
}

/*
#include <iostream>
#include <vector>
#include <map>
#include <algorithm>
#include <limits.h>

using namespace std;

int main(){
	int n, k, p = 2, i, mn = INT_MAX;
	vector<int> v;
	map<int, int> mp, mp1;
	cin >> n >> k;
	while (p <= k)
	{
		if (k % p == 0)
		{
			int h = 0;
			while (k % p == 0) k /= p, h++;
			mp1[p] = h; v.push_back(p);
		}
		p++;
	}
	for (i = 0; i < v.size(); i++)
	{
		int num = n;
		while (num != 0)
		{
			mp[v[i]] += num / v[i];
			num /= v[i];
		}
	}
	for (i = 0; i < v.size(); i++) mn = min(mn, mp[v[i]] / mp1[v[i]]);
	cout << mn << endl;
	return 0;
}
 */
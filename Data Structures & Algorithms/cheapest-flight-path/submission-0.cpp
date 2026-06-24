class Solution {
public:
    int findCheapestPrice(int n, vector<vector<int>>& flights, int src, int dst, int k) {
        vector<vector<pair<int,int>>> adj(n);
        for(auto it: flights){
            adj[it[0]].push_back({it[1],it[2]});
        }
        queue<pair<int, pair<int,int>>> pq;
        vector<int> dis(n,1e9);
        dis[src]=0;
        pq.push({0,{src,0}});
        while(!pq.empty()){
            auto it = pq.front();
            pq.pop();
            int st = it.first;
            int nd = it.second.first;
            int ct = it.second.second;
            if(st>k)continue;
            for(auto itr: adj[nd]){
                int adjN = itr.first;
                int cost = itr.second;
                if(ct+cost < dis[adjN]){
                    dis[adjN] = ct+cost;
                    pq.push({st+1,{adjN, ct+cost}});
                }
            }
        }
        if(dis[dst] != 1e9 )return dis[dst];
        else return -1;
    }
};
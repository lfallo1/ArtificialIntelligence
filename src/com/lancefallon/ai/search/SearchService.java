package com.lancefallon.ai.search;

import com.lancefallon.ai.domain.Vertex;

public interface SearchService {
    void search(Vertex vertex);
    void searchRecursive(Vertex vertex);
}

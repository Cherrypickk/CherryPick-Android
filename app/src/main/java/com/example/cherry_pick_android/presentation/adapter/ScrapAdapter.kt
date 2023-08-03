package com.example.cherry_pick_android.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cherry_pick_android.databinding.ItemScrapNewsBinding
import com.example.cherry_pick_android.data.data.ScrapNews

class ScrapAdapter(private val scrapNewsData: List<ScrapNews>) :
    RecyclerView.Adapter<ScrapAdapter.ViewHolder>() {

    // 뷰 유형에 대한 참조 클래스
    class ViewHolder(val binding: ItemScrapNewsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setNewsItem(scrapNewsData: String) {
            binding.tvNewsTitle.text = scrapNewsData
        }
    }

    // 아이템 레이아웃 호출
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemScrapNewsBinding.inflate(
            LayoutInflater.from(viewGroup.context),
            viewGroup, false
        )
        return ViewHolder(binding)
    }

    // 호출한 내용으로 bind
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.setNewsItem(scrapNewsData[position].scrapNews)
    }

    // 데이터 크기 반환
    override fun getItemCount() = scrapNewsData.size

}
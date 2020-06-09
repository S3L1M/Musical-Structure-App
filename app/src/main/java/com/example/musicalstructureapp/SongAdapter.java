package com.example.musicalstructureapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    private final ArrayList<Song> mSongList;
    private SongViewHolder holder;
    private int position;
    private final SongItemClickListener mOnClickListener;

    public interface SongItemClickListener {
        void onSongItemClick(Song song);
    }

    public SongAdapter(ArrayList<Song> songList, SongItemClickListener listener) {
        mSongList = songList;
        mOnClickListener = listener;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.song_item, parent, false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        holder.setHolderSongDetails(mSongList.get(position));
    }

    @Override
    public int getItemCount() {
        return mSongList.size();
    }

    class SongViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView uploaderTextView;
        private TextView songTitleTextView;

        public SongViewHolder(@NonNull View itemView) {
            super(itemView);

            uploaderTextView = (TextView) itemView.findViewById(R.id.tv_uploader);
            songTitleTextView = (TextView) itemView.findViewById(R.id.tv_song_title);
            itemView.setOnClickListener(this);
        }

        public void setHolderSongDetails(Song song) {
            uploaderTextView.setText(song.getUploader());
            songTitleTextView.setText(song.getTitle());
        }

        @Override
        public void onClick(View v) {
            mOnClickListener.onSongItemClick(mSongList.get(getAdapterPosition()));
        }
    }
}

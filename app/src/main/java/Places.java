public class Places {
        private String mText;
        private String mLocation;
        private int mImageResourceId = NO_IMAGE_PROVIDED;
        private static final int NO_IMAGE_PROVIDED = -1;
        public Places(String text, String location , int imageResourceId) {
            mText = text;
            mLocation = location;
            mImageResourceId = imageResourceId;
        }
        public Places(String text, String location) {
            mText = text;
            mLocation = location;
        }
        public int getImageResourceId() {
            return mImageResourceId;
        }
        public String getText() {
            return mText;
        }
        public String getLocation() {
        return mLocation;
    }
        public boolean hasImage() {
            return mImageResourceId != NO_IMAGE_PROVIDED;
        }



}
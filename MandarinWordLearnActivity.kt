package com.example.languagelearning// MandarinWordLearnActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MandarinWordLearnActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mandarin_word_learn)

        supportActionBar?.title = "Mandarin from English"

        val mandarinWords = arrayListOf(
            Word("你好", "Hello"),
            Word("再见", "Goodbye"),
            Word("谢谢", "Thank you"),
            Word("请", "Please"),
            Word("对不起", "Sorry"),
            Word("是", "Yes"),
            Word("不", "No"),
            Word("我", "I"),
            Word("你", "You"),
            Word("他", "He"),
            Word("她", "She"),
            Word("我们", "We"),
            Word("他们", "They"),
            Word("这", "This"),
            Word("那", "That"),
            Word("这里", "Here"),
            Word("那里", "There"),
            Word("谁", "Who"),
            Word("什么", "What"),
            Word("哪里", "Where"),
            Word("什么时候", "When"),
            Word("为什么", "Why"),
            Word("怎么", "How"),
            Word("很", "Very"),
            Word("太", "Too"),
            Word("很多", "Many"),
            Word("一点", "Little"),
            Word("大", "Big"),
            Word("小", "Small"),
            Word("好", "Good"),
            Word("坏", "Bad"),
            Word("对", "Right"),
            Word("错", "Wrong"),
            Word("热", "Hot"),
            Word("冷", "Cold"),
            Word("新", "New"),
            Word("旧", "Old"),
            Word("高", "High"),
            Word("低", "Low"),
            Word("高兴", "Happy"),
            Word("难过", "Sad"),
            Word("漂亮", "Beautiful"),
            Word("丑", "Ugly"),
            Word("富有", "Rich"),
            Word("贫穷", "Poor"),
            Word("容易", "Easy"),
            Word("困难", "Difficult"),
            Word("快", "Fast"),
            Word("慢", "Slow"),
            Word("近", "Near"),
            Word("远", "Far"),
            Word("打开", "Open"),
            Word("关闭", "Close"),
            Word("干净", "Clean"),
            Word("脏", "Dirty"),
            Word("健康", "Healthy"),
            Word("生病", "Sick"),
            Word("强壮", "Strong"),
            Word("虚弱", "Weak"),
            Word("甜", "Sweet"),
            Word("酸", "Sour"),
            Word("苦", "Bitter"),
            Word("美味", "Tasty"),
            Word("可口", "Delicious"),
            Word("新鲜", "Fresh"),
            Word("腐烂", "Rotten"),
            Word("明亮", "Bright"),
            Word("黑暗", "Dark"),
            Word("困难", "Hard"),
            Word("容易", "Easy"),
            Word("右边", "Right"),
            Word("左边", "Left"),
            Word("前面", "Front"),
            Word("后面", "Back"),
            Word("顶部", "Top"),
            Word("底部", "Bottom"),
            Word("内部", "Inside"),
            Word("外部", "Outside"),
            Word("第一", "First"),
            Word("最后", "Last"),
            Word("下一个", "Next"),
            Word("上一个", "Previous"),
            Word("早上好", "Good morning"),
            Word("下午好", "Good afternoon"),
            Word("晚上好", "Good evening"),
            Word("再见", "See you later"),
            Word("明天见", "See you tomorrow"),
            Word("生日快乐", "Happy birthday"),
            Word("圣诞快乐", "Merry Christmas"),
            Word("新年快乐", "Happy New Year"),
            Word("恭喜", "Congratulations"),
            Word("欢迎", "Welcome"),
            Word("祝你好运", "Good luck"),
            Word("干杯", "Cheers"),
            Word("尝鲜", "Bon appétit"),
            Word("我爱你", "I love you"),
            Word("我想念你", "I miss you"),
            Word("对不起", "I'm sorry"),
            Word("请原谅", "Excuse me"),
            Word("帮帮我", "Help"),
            Word("火", "Fire"),
            Word("警察", "Police"),
            Word("医生", "Doctor"),
            Word("医院", "Hospital"),
            Word("钱", "Money"),
            Word("食物", "Food"),
            Word("水", "Water"),
            Word("空气", "Air"),
            Word("太阳", "Sun"),
            Word("月亮", "Moon"),
            Word("地球", "Earth"),
            Word("天空", "Sky"),
            Word("云", "Cloud"),
            Word("雨", "Rain"),
            Word("雪", "Snow"),
            Word("风", "Wind"),
            Word("风暴", "Storm"),
            Word("雷", "Thunder"),
            Word("闪电", "Lightning"),
            Word("火", "Fire"),
            Word("山", "Mountain"),
            Word("树", "Tree"),
            Word("花", "Flower"),
            Word("草", "Grass"),
            Word("海", "Sea"),
            Word("河", "River"),
            Word("湖", "Lake"),
            Word("海滩", "Beach"),
            Word("沙漠", "Desert"),
            Word("森林", "Forest"),
            Word("丛林", "Jungle"),
            Word("桥", "Bridge"),
            Word("路", "Road"),
            Word("街", "Street"),
            Word("房子", "House"),
            Word("建筑", "Building"),
            Word("房间", "Room"),
            Word("床", "Bed"),
            Word("椅子", "Chair"),
            Word("桌子", "Table"),
            Word("厨房", "Kitchen"),
            Word("浴室", "Bathroom"),
            Word("马桶", "Toilet"),
            Word("窗户", "Window"),
            Word("门", "Door"),
            Word("钥匙", "Key"),
            Word("锁", "Lock"),
            Word("钟", "Clock"),
            Word("镜子", "Mirror"),
            Word("图片", "Picture"),
            Word("电视", "TV"),
            Word("电脑", "Computer"),
            Word("电话", "Phone"),
            Word("电灯", "Lamp"),
            Word("电器", "Appliance"),
            Word("冰箱", "Refrigerator"),
            Word("微波炉", "Microwave"),
            Word("烤箱", "Oven"),
            Word("洗碗机", "Dishwasher"),
            Word("洗衣机", "Washing machine"),
            Word("热水器", "Water heater"),
            Word("空调", "Air conditioner"),
            Word("扇", "Fan"),
            Word("吸尘器", "Vacuum cleaner"),
            Word("音响", "Stereo"),
            Word("音箱", "Speaker"),
            Word("电视机", "Television set"),
            Word("电视机", "Television"),
            Word("收音机", "Radio"),
            Word("报纸", "Newspaper"),
            Word("杂志", "Magazine"),
            Word("地图", "Map"),
            Word("信", "Letter"),
            Word("明信片", "Postcard"),
            Word("邮票", "Stamp"),
            Word("信封", "Envelope"),
            Word("袋子", "Bag"),
            Word("鞋子", "Shoe"),
            Word("帽子", "Hat"),
            Word("手套", "Glove"),
            Word("围巾", "Scarf"),
            Word("夹克", "Jacket"),
            Word("外套", "Coat"),
            Word("连衣裙", "Dress"),
            Word("裙子", "Skirt"),
            Word("裤子", "Trousers"),
            Word("牛仔裤", "Jeans"),
            Word("短裤", "Shorts"),
            Word("衬衫", "Shirt"),
            Word("女衬衫", "Blouse"),
            Word("毛衣", "Sweater"),
            Word("袜子", "Socks"),
            Word("内衣", "Underwear"),
            Word("胸罩", "Bra"),
            Word("睡衣", "Pajamas"),
            Word("T恤衫", "T-shirt"),
            Word("背心", "Vest"),
            Word("皮带", "Belt"),
            Word("领带", "Tie"),
            Word("戒指", "Ring"),
            Word("耳环", "Earring"),
            Word("项链", "Necklace"),
            Word("手镯", "Bracelet"),
            Word("手表", "Watch"),
            Word("眼镜", "Glasses"),
            Word("太阳镜", "Sunglasses"),
            Word("伞", "Umbrella"),
            Word("背包", "Backpack"),
            Word("钱包", "Wallet"),
            Word("钱", "Money"),
            Word("信用卡", "Credit card"),
            Word("票", "Ticket"),
            Word("护照", "Passport"),
            Word("身份证", "ID card"),
            Word("驾照", "Driver's license"),
            Word("登机牌", "Boarding pass"),
            Word("酒店", "Hotel"),
            Word("房间", "Room"),
            Word("预订", "Reservation"),
            Word("接待", "Reception"),
            Word("大厅", "Lobby"),
            Word("电梯", "Elevator"),
            Word("楼梯", "Stairs"),
            Word("地板", "Floor"),
            Word("床", "Bed"),
            Word("床单", "Sheets"),
            Word("毯子", "Blanket"),
            Word("枕头", "Pillow"),
            Word("毛巾", "Towel"),
            Word("洗发水", "Shampoo"),
            Word("肥皂", "Soap"),
            Word("牙刷", "Toothbrush"),
            Word("牙膏", "Toothpaste"),
            Word("剃须刀", "Razor"),
            Word("纸巾", "Tissue"),
            Word("垃圾桶", "Trash can"),
            Word("洗衣", "Laundry"),
            Word("洗衣机", "Washing machine"),
            Word("烘干机", "Dryer"),
            Word("熨斗", "Iron"),
            Word("闹钟", "Alarm clock"),
            Word("日历", "Calendar"),
            Word("日程表", "Schedule"),
            Word("约会", "Appointment"),
            Word("会议", "Meeting"),
            Word("聚会", "Party"),
            Word("假期", "Holiday"),
            Word("生日", "Birthday"),
            Word("周年纪念", "Anniversary"),
            Word("婚礼", "Wedding"),
            Word("葬礼", "Funeral"),
            Word("毕业典礼", "Graduation"),
            Word("庆祝", "Celebration"),
            Word("礼物", "Gift"),
            Word("惊喜", "Surprise"),
            Word("装饰", "Decoration"),
            Word("气球", "Balloon"),
            Word("蛋糕", "Cake"),
            Word("蜡烛", "Candle"),
            Word("烟花", "Fireworks"),
            Word("音乐", "Music"),
            Word("舞蹈", "Dance"),
            Word("歌曲", "Song"),
            Word("音乐会", "Concert"),
            Word("戏剧", "Play"),
            Word("电影", "Movie"),
            Word("剧院", "Theater"),
            Word("歌剧", "Opera"),
            Word("芭蕾舞", "Ballet"),
            Word("展览", "Exhibition"),
            Word("博物馆", "Museum"),
            Word("艺术", "Art"),
            Word("绘画", "Painting"),
            Word("雕塑", "Sculpture"),
            Word("摄影", "Photography"),
            Word("绘画", "Drawing"),
            Word("手工艺品", "Craft"),
            Word("陶器", "Pottery"),
            Word("木工", "Woodwork"),
            Word("缝纫", "Sewing"),
            Word("编织", "Knitting"),
            Word("刺绣", "Embroidery"),
            Word("烹饪", "Cooking"),
            Word("烘焙", "Baking"),
            Word("食谱", "Recipe"),
            Word("调味料", "Spice"),
            Word("香草", "Herb"),
            Word("调料", "Seasoning"),
            Word("酱油", "Soy sauce"),
            Word("醋", "Vinegar"),
            Word("油", "Oil"),
            Word("酱", "Sauce"),
            Word("汤", "Soup"),
            Word("肉", "Meat"),
            Word("鱼", "Fish"),
            Word("虾", "Shrimp"),
            Word("蟹", "Crab"),
            Word("贝类", "Shellfish"),
            Word("家禽", "Poultry"),
            Word("蔬菜", "Vegetable"),
            Word("水果", "Fruit"),
            Word("米饭", "Rice"),
            Word("面条", "Noodles"),
            Word("面包", "Bread"),
            Word("面粉", "Flour"),
            Word("糖", "Sugar"),
            Word("盐", "Salt"),
            Word("奶油", "Cream"),
            Word("奶酪", "Cheese"),
            Word("鸡蛋", "Egg"),
            Word("牛奶", "Milk"),
            Word("咖啡", "Coffee"),
            Word("茶", "Tea"),
            Word("啤酒", "Beer"),
            Word("红酒", "Wine"),
            Word("果汁", "Juice"),
            Word("汽水", "Soda"),
            Word("水", "Water"),
            Word("冰", "Ice"),
            Word("杯子", "Cup"),
            Word("碟子", "Plate"),
            Word("碗", "Bowl"),
            Word("刀", "Knife"),
            Word("叉子", "Fork"),
            Word("勺子", "Spoon"),
            Word("筷子", "Chopsticks"),
            Word("搅拌器", "Blender"),
            Word("炉子", "Stove"),
            Word("烤箱", "Oven"),
            Word("微波炉", "Microwave"),
            Word("烤架", "Grill"),
            Word("炒锅", "Pan"),
            Word("锅", "Pot"),
            Word("壶", "Kettle"),
            Word("烤盘", "Baking dish"),
            Word("搅拌碗", "Mixing bowl"),
            Word("蒸笼", "Steamer"),
            Word("厨房刀", "Kitchen knife"),
            Word("菜板", "Cutting board"),
            Word("厨房秤", "Kitchen scale"),
            Word("温度计", "Thermometer"),
            Word("计时器", "Timer"),
            Word("量杯", "Measuring cup"),
            Word("厨房布", "Kitchen towel"),
            Word("烤盘", "Baking sheet"),
            Word("擀面杖", "Rolling pin"),
            Word("厨房橱柜", "Kitchen cabinet"),
            Word("冰箱", "Refrigerator"),
            Word("冷冻室", "Freezer"),
            Word("储藏室", "Pantry"),
            Word("洗碗机", "Dishwasher"),
            Word("洗碗机", "Dishwasher"),
            Word("橱柜", "Cupboard"),
            Word("餐桌", "Dining table"),
            Word("椅子", "Chair"),
            Word("厨房岛", "Kitchen island"),
            Word("厨房台面", "Countertop"),
            Word("水槽", "Sink"),
            Word("龙头", "Faucet"),
            Word("炉灶", "Cooktop"),
            Word("烟囱", "Chimney"),
            Word("排气扇", "Exhaust fan"),
            Word("烤架", "Grate"),
            Word("防溅板", "Splash guard"),
            Word("抽屉", "Drawer"),
            Word("柜门", "Cabinet door"),
            Word("灯", "Light"),
            Word("吊灯", "Chandelier"),
            Word("灯泡", "Light bulb"),
            Word("灯罩", "Lampshade"),
            Word("窗帘", "Curtain"),
            Word("百叶窗", "Blind"),
            Word("窗框", "Window frame"),
            Word("窗户玻璃", "Window pane"),
            Word("门把手", "Door handle"),
            Word("门锁", "Door lock"),
            Word("门铃", "Doorbell"),
            Word("门槛", "Threshold"),
            Word("钥匙孔", "Keyhole"),
            Word("地毯", "Carpet"),
            Word("地板", "Floor"),
            Word("地砖", "Tile"),
            Word("地板暖气", "Underfloor heating"),
            Word("墙壁", "Wall"),
            Word("壁纸", "Wallpaper"),
            Word("墙纸", "Wallpaper"),
            Word("石膏板", "Drywall"),
            Word("天花板", "Ceiling"),
            Word("支撑梁", "Beam"),
            Word("柱子", "Pillar"),
            Word("栏杆", "Railing"),
            Word("扶手", "Banister"),
            Word("楼梯", "Stairs"),
            Word("楼梯间", "Staircase"),
            Word("地下室", "Basement"),
            Word("阁楼", "Attic"),
            Word("阁楼", "Loft"),
            Word("楼", "Building"),
            Word("公寓", "Apartment"),
            Word("平房", "Bungalow"),
            Word("别墅", "Villa"),
            Word("小屋", "Cottage"),
            Word("城堡", "Castle"),
            Word("宫殿", "Palace"),
            Word("高楼大厦", "Skyscraper"),
            Word("商店", "Store"),
            Word("超市", "Supermarket"),
            Word("市场", "Market"),
            Word("杂货店", "Grocery store"),
            Word("百货商店", "Department store"),
            Word("书店", "Bookstore"),
            Word("花店", "Florist"),
            Word("理发店", "Barbershop"),
            Word("美容院", "Beauty salon"),
            Word("健身房", "Gym"),
            Word("游泳池", "Swimming pool"),
            Word("网球场", "Tennis court"),
            Word("高尔夫球场", "Golf course"),
            Word("足球场", "Soccer field"),
            Word("篮球场", "Basketball court"),
            Word("棒球场", "Baseball field"),
            Word("排球场", "Volleyball court"),
            Word("乒乓球桌", "Table tennis table"),
            Word("羽毛球场", "Badminton court"),
            Word("橄榄球场", "Football field"),
            Word("赛车场", "Race track"),
            Word("马场", "Racetrack"),
            Word("马球场", "Polo field"),
            Word("高尔夫球场", "Golf course"),
            Word("操场", "Playground"),
            Word("游乐园", "Amusement park"),
            Word("动物园", "Zoo"),
            Word("水族馆", "Aquarium"),
            Word("海洋馆", "Marine museum"),
            Word("博物馆", "Museum"),
            Word("艺术馆", "Art gallery"),
            Word("科学博物馆", "Science museum"),
            Word("历史博物馆", "History museum"),
            Word("天文馆", "Planetarium"),
            Word("图书馆", "Library"),
            Word("体育馆", "Sports arena"),
            Word("剧院", "Theater"),
            Word("电影院", "Cinema"),
            Word("音乐厅", "Concert hall"),
            Word("歌剧院", "Opera house"),
            Word("表演艺术中心", "Performing arts center"),
            Word("会议中心", "Convention center"),
            Word("展览中心", "Exhibition center"),
            Word("购物中心", "Shopping center"),
            Word("商场", "Mall"),
            Word("百货公司", "Department store"),
            Word("超级市场", "Supermarket"),
            Word("商店街", "Shopping street"),
            Word("广场", "Square"),
            Word("公园", "Park"),
            Word("花园", "Garden"),
            Word("广场", "Plaza"),
            Word("停车场", "Parking lot"),
            Word("车库", "Garage"),
            Word("码头", "Dock"),
            Word("校园", "Campus"),
            Word("学校", "School"),
            Word("大学", "University"),
            Word("学院", "College"),
            Word("中学", "High school"),
            Word("小学", "Elementary school"),
            Word("幼儿园", "Kindergarten"),
            Word("托儿所", "Daycare center"),
            Word("图书馆", "Library"),
            Word("实验室", "Laboratory"),
            Word("教室", "Classroom"),
            Word("办公室", "Office"),
            Word("会议室", "Meeting room"),
            Word("礼堂", "Auditorium"),
            Word("体育馆", "Gymnasium"),
            Word("游泳池", "Swimming pool"),
            Word("篮球场", "Basketball court"),
            Word("足球场", "Soccer field"),
            Word("操场", "Playground"),
            Word("教堂", "Church"),
            Word("神庙", "Temple"),
            Word("清真寺", "Mosque"),
            Word("寺庙", "Shrine"),
            Word("教堂", "Chapel"),
            Word("修道院", "Monastery"),
            Word("教堂", "Cathedral"),
            Word("礼拜堂", "Chapel"),
            Word("神殿", "Sanctuary"),
            Word("祭坛", "Altar"),
            Word("钟楼", "Bell tower"),
            Word("圣坛", "Chancel"),
            Word("圣器柜", "Tabernacle"),
            Word("圣水盆", "Font"),
            Word("教堂窗", "Stained glass window"),
            Word("十字架", "Cross"),
            Word("圣经", "Bible"),
            Word("教会礼拜", "Mass"),
            Word("宗教仪式", "Ritual"),
            Word("宗教庆典", "Ceremony"),
            Word("宗教节日", "Holiday"),
            Word("教堂音乐", "Church music"),
            Word("宗教歌曲", "Hymn"),
            Word("赞美诗", "Psalm"),
            Word("礼拜日", "Sunday"),
            Word("圣诞节", "Christmas"),
            Word("复活节", "Easter"),
            Word("感恩节", "Thanksgiving"),
            Word("新年", "New Year"),
            Word("斋戒", "Fasting"),
            Word("善行", "Charity"),
            Word("奉献", "Devotion"),
            Word("礼拜", "Worship"),
            Word("祈祷", "Prayer"),
            Word("祈祷", "Pray"),
            Word("祝福", "Blessing"),
            Word("忏悔", "Repentance"),
            Word("敬拜", "Adoration"),
            Word("圣餐", "Communion"),
            Word("圣礼", "Sacrament"),
            Word("洗礼", "Baptism"),
            Word("弥撒", "Mass"),
            Word("认罪", "Confession"),
            Word("传教", "Preach"),
            Word("宗教团体", "Congregation"),
            Word("教友", "Parishioner"),
            Word("僧侣", "Monk"),
            Word("尼姑", "Nun"),
            Word("神父", "Priest"),
            Word("牧师", "Pastor"),
            Word("牧师", "Minister"),
            Word("圣职人员", "Clergy"),
            Word("信徒", "Believer"),
            Word("教徒", "Disciple"),
            Word("教会", "Church"),
            Word("基督教", "Christianity"),
            Word("基督", "Christ")
        )


        val recyclerView = findViewById<RecyclerView>(R.id.wordRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = WordAdapter(this, mandarinWords)
        recyclerView.adapter = adapter
    }
}

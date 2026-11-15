.class public LT1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT1/b$b;,
        LT1/b$a;
    }
.end annotation


# static fields
.field private static final c:[Ljava/lang/String;

.field private static final d:[Ljava/lang/String;

.field private static e:LT1/b;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "_italic"

    .line 2
    .line 3
    const-string v1, "_bold_italic"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const-string v3, "_bold"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, LT1/b;->c:[Ljava/lang/String;

    .line 14
    .line 15
    const-string v0, ".ttf"

    .line 16
    .line 17
    const-string v1, ".otf"

    .line 18
    .line 19
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LT1/b;->d:[Ljava/lang/String;

    .line 24
    .line 25
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LT1/b;->a:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LT1/b;->b:Ljava/util/Map;

    .line 17
    .line 18
    return-void
.end method

.method private static a(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;
    .locals 7

    .line 1
    sget-object v0, LT1/b;->c:[Ljava/lang/String;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    sget-object v1, LT1/b;->d:[Ljava/lang/String;

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v2, :cond_0

    .line 10
    .line 11
    aget-object v4, v1, v3

    .line 12
    .line 13
    new-instance v5, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v6, "fonts/"

    .line 19
    .line 20
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    :try_start_0
    invoke-static {p2, v4}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 37
    .line 38
    .line 39
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    return-object p0

    .line 41
    :catch_0
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {p0, p1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static b()LT1/b;
    .locals 1

    .line 1
    sget-object v0, LT1/b;->e:LT1/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LT1/b;

    .line 6
    .line 7
    invoke-direct {v0}, LT1/b;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, LT1/b;->e:LT1/b;

    .line 11
    .line 12
    :cond_0
    sget-object v0, LT1/b;->e:LT1/b;

    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    new-instance v0, LT1/b$b;

    .line 2
    .line 3
    invoke-direct {v0, p2}, LT1/b$b;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, p3}, LT1/b;->d(Ljava/lang/String;LT1/b$b;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public d(Ljava/lang/String;LT1/b$b;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;
    .locals 2

    .line 1
    iget-object v0, p0, LT1/b;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p3, p0, LT1/b;->b:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/graphics/Typeface;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, LT1/b$b;->a(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    iget-object v0, p0, LT1/b;->a:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, LT1/b$a;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    new-instance v0, LT1/b$a;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v0, v1}, LT1/b$a;-><init>(LT1/a;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, LT1/b;->a:Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {p2}, LT1/b$b;->b()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-virtual {v0, p2}, LT1/b$a;->a(I)Landroid/graphics/Typeface;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    invoke-static {p1, p2, p3}, LT1/b;->a(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, p2, v1}, LT1/b$a;->b(ILandroid/graphics/Typeface;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-object v1
.end method

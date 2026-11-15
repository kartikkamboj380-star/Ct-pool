.class public final LP4/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP4/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic a:[LD5/g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lw5/q;

    .line 2
    .line 3
    const-string v1, "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-class v3, LP4/f$b;

    .line 7
    .line 8
    const-string v4, "dataStore"

    .line 9
    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, Lw5/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lw5/w;->e(Lw5/p;)LD5/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    new-array v1, v1, [LD5/g;

    .line 19
    .line 20
    aput-object v0, v1, v2

    .line 21
    .line 22
    sput-object v1, LP4/f$b;->a:[LD5/g;

    .line 23
    .line 24
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LP4/f$b;-><init>()V

    return-void
.end method

.method public static final synthetic a(LP4/f$b;Landroid/content/Context;)LC/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP4/f$b;->b(Landroid/content/Context;)LC/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b(Landroid/content/Context;)LC/f;
    .locals 3

    .line 1
    invoke-static {}, LP4/f;->a()Lz5/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LP4/f$b;->a:[LD5/g;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    invoke-interface {v0, p1, v1}, Lz5/a;->a(Ljava/lang/Object;LD5/g;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, LC/f;

    .line 15
    .line 16
    return-object p1
.end method


# virtual methods
.method public final c()LP4/f;
    .locals 2

    .line 1
    sget-object v0, LY3/c;->a:LY3/c;

    .line 2
    .line 3
    invoke-static {v0}, LY3/m;->a(LY3/c;)LY3/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, LP4/f;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, LY3/f;->k(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "Firebase.app[SessionsSettings::class.java]"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast v0, LP4/f;

    .line 19
    .line 20
    return-object v0
.end method

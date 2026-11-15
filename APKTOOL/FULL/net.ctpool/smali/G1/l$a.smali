.class LG1/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG1/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:LG1/l$a;

.field b:I

.field c:Ljava/util/LinkedList;

.field d:LG1/l$a;


# direct methods
.method private constructor <init>(LG1/l$a;ILjava/util/LinkedList;LG1/l$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG1/l$a;->a:LG1/l$a;

    iput p2, p0, LG1/l$a;->b:I

    iput-object p3, p0, LG1/l$a;->c:Ljava/util/LinkedList;

    iput-object p4, p0, LG1/l$a;->d:LG1/l$a;

    return-void
.end method

.method synthetic constructor <init>(LG1/l$a;ILjava/util/LinkedList;LG1/l$a;LG1/k;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, LG1/l$a;-><init>(LG1/l$a;ILjava/util/LinkedList;LG1/l$a;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "LinkedEntry(key: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, LG1/l$a;->b:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ")"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

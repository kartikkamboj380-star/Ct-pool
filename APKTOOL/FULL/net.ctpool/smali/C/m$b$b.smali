.class public final LC/m$b$b;
.super LC/m$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC/m$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lv5/p;

.field private final b:LH5/u;

.field private final c:LC/n;

.field private final d:Lm5/g;


# direct methods
.method public constructor <init>(Lv5/p;LH5/u;LC/n;Lm5/g;)V
    .locals 1

    .line 1
    const-string v0, "transform"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "callerContext"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, v0}, LC/m$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LC/m$b$b;->a:Lv5/p;

    .line 21
    .line 22
    iput-object p2, p0, LC/m$b$b;->b:LH5/u;

    .line 23
    .line 24
    iput-object p3, p0, LC/m$b$b;->c:LC/n;

    .line 25
    .line 26
    iput-object p4, p0, LC/m$b$b;->d:Lm5/g;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a()LH5/u;
    .locals 1

    .line 1
    iget-object v0, p0, LC/m$b$b;->b:LH5/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lm5/g;
    .locals 1

    .line 1
    iget-object v0, p0, LC/m$b$b;->d:Lm5/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()LC/n;
    .locals 1

    .line 1
    iget-object v0, p0, LC/m$b$b;->c:LC/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lv5/p;
    .locals 1

    .line 1
    iget-object v0, p0, LC/m$b$b;->a:Lv5/p;

    .line 2
    .line 3
    return-object v0
.end method

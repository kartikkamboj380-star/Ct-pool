.class final Ls1/d$a;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final m:Ls1/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ls1/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ls1/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls1/d$a;->m:Ls1/d$a;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lw5/l;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final a()Ls1/d;
    .locals 2

    .line 1
    new-instance v0, Ls1/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ls1/d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls1/d$a;->a()Ls1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

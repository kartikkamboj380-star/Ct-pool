.class LJ0/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field public final a:LJ0/i;

.field public final b:Ljava/io/File;


# direct methods
.method constructor <init>(Ljava/io/File;LJ0/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LJ0/k$a;->a:LJ0/i;

    .line 5
    .line 6
    iput-object p1, p0, LJ0/k$a;->b:Ljava/io/File;

    .line 7
    .line 8
    return-void
.end method

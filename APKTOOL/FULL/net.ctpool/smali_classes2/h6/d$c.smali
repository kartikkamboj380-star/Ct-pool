.class public final Lh6/d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh6/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:I

.field private final b:Li6/i;


# direct methods
.method public constructor <init>(ILi6/i;)V
    .locals 1

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lh6/d$c;->a:I

    .line 10
    .line 11
    iput-object p2, p0, Lh6/d$c;->b:Li6/i;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Li6/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/d$c;->b:Li6/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lh6/d$c;->a:I

    .line 2
    .line 3
    return v0
.end method

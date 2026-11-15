.class public LD1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD1/i;


# instance fields
.field private final m:I

.field private final n:I

.field private final o:I

.field private final p:LD1/l;

.field private final q:Ljava/util/Map;


# direct methods
.method public constructor <init>(IIILD1/l;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LD1/j;->m:I

    .line 5
    .line 6
    iput p2, p0, LD1/j;->n:I

    .line 7
    .line 8
    iput p3, p0, LD1/j;->o:I

    .line 9
    .line 10
    iput-object p4, p0, LD1/j;->p:LD1/l;

    .line 11
    .line 12
    iput-object p5, p0, LD1/j;->q:Ljava/util/Map;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public getExtras()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LD1/j;->q:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, LD1/j;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, LD1/j;->m:I

    .line 2
    .line 3
    return v0
.end method
